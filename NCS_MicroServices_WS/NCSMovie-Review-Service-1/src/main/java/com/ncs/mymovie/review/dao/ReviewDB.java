package com.ncs.mymovie.review.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ncs.mymovie.review.model.Review;

@Component
public class ReviewDB {

	List<Review> allReviews = new ArrayList<>();
	
	public ReviewDB() {
		Review r1_1 = new Review(1, 1, "Mike", 4, "Good Movie");
		Review r1_2 = new Review(1, 2, "Mike", 1, "Booring");
		Review r2_2 = new Review(2, 2, "Jenny", 3, "One time watch movie ... nithing special");
		Review r2_3 = new Review(2, 3, "Jenny", 1, "no comments");
		Review r3_1 = new Review(3, 1, "Ramesh", 3, "Okay");
		
		
		allReviews.add(r1_1);
		allReviews.add(r1_2);
		allReviews.add(r2_2);
		allReviews.add(r2_3);
		allReviews.add(r3_1);
				
	}
	
	public List<Review> getReviewsByMovie(int movieId)
	{
		List<Review> allReviewsOfMovie = allReviews.stream().filter((m)->{
			if(m.getMovieId() == movieId)
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
		return allReviewsOfMovie;
	}
	
	
	public float getAvgReviewofMovie(int movieId)
	{
		List<Review> allReviewsOfMovie = getReviewsByMovie(movieId);
		float avgRating = 0;
		int totalReview = 0;
		if(allReviewsOfMovie != null)
		{
			
			for (Review review : allReviewsOfMovie) {
				totalReview += review.getStarPoints();
			}
			
			avgRating = totalReview/allReviewsOfMovie.size();
			return avgRating;
		}
		
		
		return 0;
	}
	
	
	
}//end of class
