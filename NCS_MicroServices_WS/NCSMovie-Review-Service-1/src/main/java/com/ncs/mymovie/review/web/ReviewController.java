package com.ncs.mymovie.review.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.mymovie.review.dao.ReviewDB;
import com.ncs.mymovie.review.model.Review;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

	@Autowired
	ReviewDB reviewDB;
	
	public ReviewController() {
		System.out.println("----->> Inside Review Cotroller Constructor ...");
	}
	
	@GetMapping("/{movieId}")
	public List<Review> getReviewOfMovie(@PathVariable int movieId) 
	{
		System.out.println(" -------->> 1 Inside Review Controller "+movieId);
		List<Review> reviews =  reviewDB.getReviewsByMovie(movieId);
		System.out.println(" -->> 2 List of Reviews "+reviews.size());
		return reviews;
	}
	
	@GetMapping("/rating/{movieId}")
	public float getAvgReviewByMovie(@PathVariable int movieId)
	{
		float ratings = reviewDB.getAvgReviewofMovie(movieId);
		return ratings;
	}
	
}
