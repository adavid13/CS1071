package assignment5;
/** Represents a rental class of type trailer. Extends Rentals 
 * 
 * @author Amir David
 *
 */
public class Trailers extends Rentals {
	/**
	 * The weight of the trailer
	 */
	private double weight;
	
	/**
	 * Constructs a new Trailers object, sets the id of the trailer in the parent class and sets the weight of the trailer
	 * @param id the id of the trailer
	 * @param weight the weight of the trailer
	 */
	public Trailers(int id, double weight) {
		super(id);
		this.weight = weight;
	}

	/**
	 * an accessor method to get the weight of the trailer
	 * @return returns the weight of the trailer
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * a method that calculates and returns the cost of renting the trailer
	 */
	public double calculateCost() {
		return 10;
	}
	
}
