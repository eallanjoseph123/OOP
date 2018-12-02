package ood.parkinglot;

public interface Car extends CarDetail {
	CarType getTypeOfCar();
	Ticket getTicket();
	void setTicket(Ticket ticket);
	
}
