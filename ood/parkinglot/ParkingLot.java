package ood.parkinglot;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingLot {

	private List<Space> level;
	
	private Map<String, Space> cars;

	// default
	public ParkingLot() {
		this.level = Arrays.asList(
									new Space(1, 2, true),
									new Space(2, 2, true));

		cars = new HashMap<>(level.size());
	}

	public ParkingLot(Space... space) {
		this.level = Arrays.asList(space);
		cars = new HashMap<>(level.size());
	}

	public void enter(Car car) {
		Optional<Space> mySpace = level.stream()
							.filter(Space::isAvailable)
							.findFirst();
	
		if (mySpace.isPresent()) {
			Space space = mySpace.get();
				cars.put(car.getPlateNumber(), space);
				int totalSpace = space.getTotalSpace();
				int newTotalSpace = totalSpace - car.getTypeOfCar().getNumberOfSpot(); // decrease space lot
				space.setTotalSpace(newTotalSpace);
				Ticket ticket = this.generateTicket(car, space);
				car.setTicket(ticket);
				System.out.println("you are successfully entered " + car.getPlateNumber());
			
		} else {

			System.out.println("sorry the car space lot is full for " + car.getPlateNumber());

		}
		
	}

	public void exit(Car car) {
		Ticket ticket =  car.getTicket();
		ticket.setExitTime(LocalDateTime.now());
		CarDetail carDetail = ticket.getCarDetail();
		Space space = cars.get(carDetail.getPlateNumber());
		int totalSpace = space.getTotalSpace();
		int newTotalSpace = totalSpace + car.getTypeOfCar().getNumberOfSpot(); // increase space lot
		space.setTotalSpace(newTotalSpace);
		cars.remove(carDetail.getPlateNumber());
		
		System.out.println("exit car "+carDetail.getPlateNumber());
		
	}

	private Ticket generateTicket(Car car, Space space) {
		Ticket ticket = new Ticket();
		ticket.setTimeIn(LocalDateTime.now());
		ticket.setSpaceDetail(space);
		ticket.setHourFee(10);
		ticket.setCarDetail(car);
		return ticket;
	}

}
