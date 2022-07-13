package com.ncs.mymovie.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ncs.mymovie.model.Movie;
import com.ncs.mymovie.model.Review;

@Component
public class MovieDB {

	List<Movie> allMovies = new ArrayList<>();
	
	public MovieDB() {
		Movie m1 = new Movie(1, "Terminator", 1.45f, 0, null);
		Movie m2 = new Movie(2, "Terminal", 1.40f, 0, null);
		Movie m3 = new Movie(3, "Avatar", 2.1f, 0, null);
		Movie m4 = new Movie(4, "ABC", 1.5f, 0, null);
		
		allMovies.add(m1);
		allMovies.add(m2);
		allMovies.add(m3);
		allMovies.add(m4);
		
		
	}
	
	public List<Movie> getAllMovies() {
		return allMovies;
	}

	public Movie getMovieByID(int movieId)
	{
		Movie movie = allMovies.stream().filter((m)->{
			if(m.getMovieId() == movieId)
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList()).get(0);
		
		return movie;
	}
	
	public void addReview(int movieId,Review review)
	{
		Movie movie = getMovieByID(movieId);
		
		if(movie != null)
		{
			List<Review> allReviews =  movie.getUserReviews();
			allReviews.add(review);
			movie.setUserReviews(allReviews);
			
		}
	}
}
