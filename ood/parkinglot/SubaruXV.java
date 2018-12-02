package ood.parkinglot;

public class SubaruXV implements Car{
	
	private String platNum;
	
	private Ticket ticket;

	@Override
	public CarType getTypeOfCar() {
		return CarType.MEDIUM;
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
		// TODO Auto-generated method stub
		return this.ticket;
	}

	@Override
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;		
	}

}
