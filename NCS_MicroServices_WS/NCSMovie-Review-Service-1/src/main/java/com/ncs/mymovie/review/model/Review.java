package com.ncs.mymovie.review.model;

import org.springframework.stereotype.Component;

@Component
public class Review {
	private int userId;
	private int movieId;
	private String username;
	private int starPoints;
	private String commensts;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int userId, int movieId, String username, int starPoints, String commensts) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.username = username;
		this.starPoints = starPoints;
		this.commensts = commensts;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getStarPoints() {
		return starPoints;
	}
	public void setStarPoints(int starPoints) {
		this.starPoints = starPoints;
	}
	public String getCommensts() {
		return commensts;
	}
	public void setCommensts(String commensts) {
		this.commensts = commensts;
	}
	
	
}
