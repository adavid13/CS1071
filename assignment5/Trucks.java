package assignment5;
/**
 * Represents a truck class that extends Vehicles
 * @author Amir David
 *
 */
public class Trucks extends Vehicles{
	/** the weight carrying capability of the truck*/
	private double carryWeight;
	/** an object of type trailer that will attach to the truck*/
	private Trailers trailer;
	/** the trailer-attachment status of the truck*/
	private boolean isAttached;
	
	/**
	 * constructs a new Trucks object and sets the id and insurance type in the parent class and the carrying weight
	 * @param id the id of the truck
	 * @param insurance the insurance type of the truck
	 * @param carryWeight the carrying weight of the truck
	 */
	public Trucks(int id, String insurance, double carryWeight) {
		super(id,insurance);
		this.carryWeight = carryWeight;
		isAttached = false;
	}
	/**
	 * a method that checks if the trailer can be attached to the truck and attaches it if so
	 * @param trailer the trailer object that will be attached to the truck
	 */
	public void attachTrailer(Trailers trailer) {
		if((this.carryWeight>=trailer.getWeight())&&(trailer.isRented()==false)) {
			isAttached = true;
			this.trailer = trailer;
			trailer.rent();
		}else{
			isAttached = false;
		}
	}
	/**
	 * an accessor method for the trailer-attachment status of the truck
	 * @return returns if a trailer is attached to the truck or not
	 */
	public String isAttached() {
		return ""+isAttached;
	}
	/**
	 * a method that calculates the cost of renting the truck
	 */
	protected double vehicleCost() {
		if(isAttached == true) {
			return 10+(carryWeight/100)+trailer.calculateCost();
		}
		return 10+carryWeight/100;
	}
	/**
	 * a method that calculates the total per-day cost of renting the truck
	 */
	public double calculateCost() {
		return this.vehicleCost()+insuranceCost();
	}
	

}
