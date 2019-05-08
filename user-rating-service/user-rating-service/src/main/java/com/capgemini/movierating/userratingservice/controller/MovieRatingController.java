package com.capgemini.movierating.userratingservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movierating.entity.UserRating;
import com.capgemini.movierating.userratingservice.entity.Rating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	private List <Rating> ratings;
	
	public MovieRatingController() {
		ratings = new ArrayList<Rating>();
		ratings.add(new Rating(101,5.0));
		ratings.add(new Rating(102,4.0));
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserRating> getUserRatings(@PathVariable String userId){
		UserRating userRating = new UserRating();
		if(userId.equals("amit")) {
			userRating.setUserRating(ratings);
				return new ResponseEntity<UserRating>(userRating,HttpStatus.OK);
	}
	return new ResponseEntity<UserRating>(HttpStatus.NOT_FOUND);

}
}
