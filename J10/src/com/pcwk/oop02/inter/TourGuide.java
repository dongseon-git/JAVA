package com.pcwk.oop02.inter;

public class TourGuide {
	
	//private Providable tour = new KoreaTour();
	private Providable tour = null;
	
	public TourGuide() {
		
	}
	
	public TourGuide(Providable tour) {
		this.tour = tour;
	} 
	
	
	public void leisureSports() {
	    tour.leisureSports();	
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}
}
