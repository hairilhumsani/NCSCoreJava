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
package com.abcuni.QuizPracticesAdminService.web;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcuni.QuizPracticesAdminService.dto.JWTResponseDTO;
import com.abcuni.QuizPracticesAdminService.dto.UsersDTO;
import com.abcuni.QuizPracticesAdminService.security.JWTUtil;
import com.abcuni.QuizPracticesAdminService.service.AdminService;

@RestController
@RequestMapping("/public")
public class TokenValidatorController {

	@Value("${security.orgKey}")
	String orgKey;

	@Autowired
	AdminService adminService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	JWTUtil jwtUtil;

	@GetMapping("/validate")
	public boolean validateToken(HttpServletRequest request) {
		String requestedTokenHeader = request.getHeader("Authorization");
		String requestedTokenHeaderAuthority = request.getHeader("authority");

		// String requestedTokenHeader = token;
		String username = null;
		String jwtToken = null;

		// System.out.println("\n\n ---->> 1 orgKey "+orgKey+" requestTokenHeader
		// "+requestedTokenHeader);
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
	public ResponseEntity<JWTResponseDTO> doLogin(@RequestBody UsersDTO userEntry) throws Exception {
		System.out.println("----->> inside public/login " + userEntry);

		try {

			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(userEntry.getUsername(), userEntry.getPassword()));

		} catch (Exception e) {
			throw new Exception("Bad credentials ");
		}

		UserDetails userDetails = adminService.loadUserByUsername(userEntry.getUsername());

		String token = jwtUtil.generateToken(userDetails);

		boolean isValid = token != null ? true : false;

		JWTResponseDTO jwtResponseDTO = new JWTResponseDTO(token, userEntry.getUsername(), isValid);

		return new ResponseEntity<JWTResponseDTO>(jwtResponseDTO, HttpStatus.OK);
	}
}// end class
