package assignment5;
/**
 * represents an abstract class that will use as a 'blueprint' for rentals of type vehicle
 * @author Amir David
 *
 */
public abstract class Vehicles extends Rentals {
	/** the insurance type of the vehicle*/
	private String insurance;
	
	/**
	 * Constructs a new Vehicles object and sets the id in the parent class' constructor and the insurance type
	 * @param id the id of the vehicle
	 * @param insurance the insurance type of the vehicle
	 */
	public Vehicles(int id,String insurance) {
		super(id);
		this.insurance = insurance;
	}
	/**
	 * a method that calculates the cost of the insurance of the vehicle 
	 * @return returns the cost of insurance of the vehicle
	 */
	protected double insuranceCost() {
		if(insurance == "A") {
			return 5.0;
		}else if(insurance == "B") {
			return 10.0;
		}else if(insurance == "C") {
			return 20.0;
		}else if(insurance == "D") {
			return 50.0;
		}else if(insurance == "E") {
			return 100.0;
		}
		return 0;
	}
	/**
	 * an accessor method to get the insurance type of the vehicle
	 * @return returns the type of insurance of the vehicle
	 */
	public String getInsurance() {
		return this.insurance;
	}
	/**
	 * an abstract method to calculate the cost of renting the vehicle
	 * @return the cost of renting the vehicle
	 */
	protected abstract double vehicleCost();
}
