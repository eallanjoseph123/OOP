package ood.parkinglot;

public class TestMain {
	
	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		
		Car car = new Mazda2Hatch();
		car.setPlateNumber("YIP90s");
		
		Car car2 = new Mazda2Hatch();
		car2.setPlateNumber("YIP90s3");
		
		Car car3 = new SubaruXV();
		car3.setPlateNumber("IPO123s");
		
		Car car4 = new SubaruXV();
		car4.setPlateNumber("IPO123ss");
		
		Car car5 = new SubaruXV();
		car5.setPlateNumber("asbc132");
		

		lot.enter(car);
		lot.enter(car2);
		lot.enter(car3);
		lot.enter(car4);
		lot.enter(car5);
		
		lot.exit(car4);
		lot.enter(car5);
		
	}
}
