package com.capgemini.movierating.entity;

import java.util.List;

import com.capgemini.movierating.userratingservice.entity.Rating;

public class UserRating {
	
	private List<Rating> userRating;

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Rating> userRating) {
		super();
		this.userRating = userRating;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	

}
