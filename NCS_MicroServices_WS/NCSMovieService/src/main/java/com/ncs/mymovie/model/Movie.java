package com.ncs.mymovie.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	private int movieId;
	private String movieName;
	private float duration;
	private float ratings;
	private List<Review> userReviews;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, float duration, float ratings, List<Review> userReviews) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.duration = duration;
		this.ratings = ratings;
		this.userReviews = userReviews;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public List<Review> getUserReviews() {
		return userReviews;
	}
	public void setUserReviews(List<Review> userReviews) {
		this.userReviews = userReviews;
	}
	
	
}
