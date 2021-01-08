package com.training.service;

import com.training.model.Tour;

public class TourService {

	public int addTour(Tour tour){
		int status = 0;
		
		if(tour!=null) {
			status = 1;
		}
		
		return status;	
	}
	
	public int updateTour(Tour tour) {

		int status = 0;
		status  = status + 2;
		
		return status;
	}
}
