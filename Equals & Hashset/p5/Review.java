package p5;

import java.io.Serializable;

public class Review implements Serializable, Comparable<Review>{

	private static final long serialVersionUID = 1L;

	private int starRating;

	private String comment;

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int compareTo(Review o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Review [starRating=" + starRating + ", comment=" + comment + "]";
	}
	
	
}
