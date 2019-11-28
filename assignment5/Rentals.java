package assignment5;
/** Represents an abstract rentals class that will be the 'blueprint' for any rentals the company offers.
 * 
 * @author Amir David
 *
 */
public abstract class Rentals {
	/** The id of the rental*/
	private int id;
	/** The renting-status of the rental*/
	private boolean rented;
	
	/**
	 * Constructs a new Rentals object and sets the id and renting-status
	 * @param id the id of the rental
	 */
	public Rentals(int id) {
		this.id = id;
		rented = false;
	}
	/**
	 * an accessor method to get the id of the rental
	 * @return returns the id of the rental
	 */
	public int getId() {
		return id;
	}
	/**
	 * a setter method that sets the renting-status to 'rented'
	 */
	public void rent() {
		this.rented = true;
	}
	/**
	 * a setter method that sets the renting-status to 'not rented'
	 */
	public void returns() {
		this.rented = false;
	}
	/**
	 * an accessor method to get the renting-status of the rental
	 * @return returns the renting-status
	 */
	public boolean isRented() {
		return rented;
	}
	/**
	 * an abstract method that will use as a place holder for cost calculation of rentals
	 * @return returns the full rental cost
	 */
	public abstract double calculateCost();

}
