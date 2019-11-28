package assignment5;
/**
 * represents a car class that extends Vehicles
 * @author Amir David
 *
 */
public class Cars extends Vehicles{
	/** the number of seats that the car has*/
	private int seats;
	
	/**
	 * constructs a Cars object and sets the id and insurance type in the parent class and the number of seats
	 * @param id the id of the car
	 * @param insurance the insurance type of the car
	 * @param seats the number of seats of the car
	 */
	public Cars(int id,String insurance,int seats) {
		super(id,insurance);
		this.seats = seats;
	}
	/**
	 * an accessor method to get the number of seats of the car
	 * @return returns the number of seats
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * a method that calculates the cost of renting the vehicle
	 */
	public double vehicleCost() {
		return 10+5*seats;
	}
	/**
	 * a method that calculates the total per-day cost of renting the vehicle
	 */
	public double calculateCost() {
		return vehicleCost()+insuranceCost();
	}

}
