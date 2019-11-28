package assignment5;

public class RentalDriver {

	public static void main(String[] args) {
		
		Cars car1 = new Cars(1,"A",5);
		Cars car2 = new Cars(2,"B",2);
		
		Trucks truck1 = new Trucks(3,"C",4500);
		Trucks truck2 = new Trucks(4,"D",8700);
		
		Trailers trailer1 = new Trailers(5,2200);
		Trailers trailer2 = new Trailers(6,6500);
		
		truck1.attachTrailer(trailer2);
		truck2.attachTrailer(trailer1);
		
		System.out.println("Car 1 cost: $"+car1.calculateCost()+" insurance type: "+car1.getInsurance()+"\nCar 2 cost: $"+car2.calculateCost()+" insurance type: "
		+car2.getInsurance()+"\nTruck 1 cost: $"+truck1.calculateCost()+" insurance type: "+truck1.getInsurance()+" trailer attached: "+truck1.isAttached()
		+"\nTruck 2 cost: $"+truck2.calculateCost()+" insurance type: "+truck2.getInsurance()+" trailer attached: "+truck2.isAttached());
		

	}

}
