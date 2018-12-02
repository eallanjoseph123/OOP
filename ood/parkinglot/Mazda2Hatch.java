package ood.parkinglot;

public class Mazda2Hatch implements Car {
	
	private String platNum;
	
	private Ticket ticket;
	
	@Override
	public CarType getTypeOfCar() {
		return CarType.SMALL;
	}

	@Override
	public String getPlateNumber() {
		return this.platNum;
	}

	@Override
	public void setPlateNumber(String plateNumber) {
		this.platNum = plateNumber;
	}

	@Override
	public Ticket getTicket() {
		return this.ticket;
	}

	@Override
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
		
	}

}
