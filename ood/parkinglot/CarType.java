package ood.parkinglot;

public enum CarType {
	SMALL(1),
	MEDIUM(1),
	BIG(2);
	
	private int numberOfSpot;

	private CarType(int numberOfSpot) {
		this.numberOfSpot = numberOfSpot;
	}

	public int getNumberOfSpot() {
		return numberOfSpot;
	}
	
	
}
