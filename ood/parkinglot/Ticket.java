package ood.parkinglot;

import java.time.LocalDateTime;

public class Ticket {
	
	private LocalDateTime timeIn;
	
	private LocalDateTime exitTime;
	
	private Space spaceDetail;
	
	private double hourFee;
	
	private CarDetail carDetail;
	
	public CarDetail getCarDetail() {
		return carDetail;
	}

	public void setCarDetail(CarDetail carDetail) {
		this.carDetail = carDetail;
	}

	public Space getSpaceDetail() {
		return spaceDetail;
	}

	public void setSpaceDetail(Space spaceDetail) {
		this.spaceDetail = spaceDetail;
	}


	public LocalDateTime getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(LocalDateTime timeIn) {
		this.timeIn = timeIn;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public double getHourFee() {
		return hourFee;
	}

	public void setHourFee(double hourFee) {
		this.hourFee = hourFee;
	}
	
	public double getTotalFee() {
		
		return 0;
	}

}
