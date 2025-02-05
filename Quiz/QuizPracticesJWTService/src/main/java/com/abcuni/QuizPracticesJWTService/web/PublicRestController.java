//Adding Header in Rest Template 

/*
		 // from import org.springframework.http
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+"abc");

		HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
		boolean userStatus = restTemplate.getForObject(url, entity, Boolean.class);
		*/

//-------------------------------------------------------------------
package com.abcuni.QuizPracticesJWTService.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abcuni.QuizPracticesJWTService.dto.JWTResponseDTO;
import com.abcuni.QuizPracticesJWTService.model.Users;
import com.abcuni.QuizPracticesJWTService.security.JWTUtil;
import com.abcuni.QuizPracticesJWTService.security.MyUserDetails;
import com.abcuni.QuizPracticesJWTService.service.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/api/public")
public class PublicRestController {

	@Value("${security.orgKey}")
	String orgKey;

	@Autowired
	AdminService adminService;

	@Autowired
	MyUserDetails myDetails;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	JWTUtil jwtUtil;

	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/validate")
	public boolean validateToken(HttpServletRequest request) {
		String requestedTokenHeader = request.getHeader("Authorization");
		

		// String requestedTokenHeader = token;
		String username = null;
		String jwtToken = null;

		System.out.println("\n\n ---->> 1 orgKey " + orgKey + " requestTokenHeader" + requestedTokenHeader);
		if (requestedTokenHeader != null && requestedTokenHeader.startsWith(orgKey)) {
			System.out.println("\n\n  ***---->> 2 code Inside filter " + requestedTokenHeader + "\n");
			int cutToken = orgKey.length();
			jwtToken = requestedTokenHeader.substring(cutToken);
			System.out.println("\n\n  ***---->> 3 JWT Token is  " + jwtToken + "\n");

			try {

				username = jwtUtil.extractUsername(jwtToken);
				System.out.println(" 4 username from token is :- " + username);

			} catch (Exception e) {
				System.out.println(" --->> 4.b exception inside extract usernmae " + e);
				return false;
				// ideally should throw Custom Exception
			}

			// --- code execute if no exception

			if (username != null) {

				UserDetails userDetails = this.adminService.loadUserByUsername(username);
				System.out.println(" --->> 5 Inside if Username not null " + userDetails);

				System.out.println(userDetails.getAuthorities());

				if (jwtUtil.validateToken(jwtToken, userDetails)) {

					System.out.println(" --->> 6 Inside if jwtToken Validate ");
					UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
							userDetails, null, userDetails.getAuthorities());

					usernamePasswordAuthenticationToken
							.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
					return true;
				}

				else {
					System.out.println("--->> 5.b Inside else ");
					return false;
				}

			} // end if username != null
		} // end if
		else {
			System.out.println("2.b Token is not validated ...");
			return false;

		}

		return false;
	}// end of get mapping

	@PostMapping("/login")
	public ResponseEntity<JWTResponseDTO> doLogin(@RequestBody Users userEntry) throws Exception {
		System.out.println("----->> inside public/login " + userEntry);
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(userEntry.getUsername(), userEntry.getPassword()));
			System.out.println();
		} catch (Exception e) {
			throw new Exception("Bad credentials ");
		}
		UserDetails userDetails = adminService.loadUserByUsername(userEntry.getUsername());
		myDetails = (MyUserDetails) userDetails;
		String token = jwtUtil.generateToken(userDetails);
		boolean isValid = token != null ? true : false;
		JWTResponseDTO jwtResponseDTO = new JWTResponseDTO(token, userEntry.getUsername(), isValid, myDetails.getRole());
		return new ResponseEntity<JWTResponseDTO>(jwtResponseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public Users addAdmin(@RequestBody Users users) throws Exception {
		Users user = null;
		try {
			user = adminService.saveUsers(users);
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return user;
	}
}// end class
