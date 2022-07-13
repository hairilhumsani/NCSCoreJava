package com.ncs.mymovie.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ncs.mymovie.dao.MovieDB;
import com.ncs.mymovie.model.Movie;
import com.ncs.mymovie.model.Review;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

	@Autowired
	MovieDB movieDB;
	
	@Autowired
	RestTemplate restTemplate;
	
	public MovieController() {
		System.out.println(" --->> Movie Controller Constructor ....");
	}

	@GetMapping("/{movieId}")
	public Movie getMovieByID(@PathVariable int movieId)
	{
		Movie m = movieDB.getMovieByID(movieId);                     
		
		Float ratings = restTemplate.getForObject("http://NCS-MOVIE-REVIEW-SERVICE/api/review/rating/"+movieId,Float.class);
		m.setRatings(ratings);
		System.out.println("--->> 3 Inside Movie Service Controller m :- "+m.getRatings());
		
		List<Review> reviews  = restTemplate.getForObject("http://NCS-MOVIE-REVIEW-SERVICE/api/review/"+movieId, List.class);
		m.setUserReviews(reviews);
		
		return m;
	}
	
	@GetMapping("/list")
	public List<Movie> getMovie()
	{
		return movieDB.getAllMovies();
	}
	
	
}
