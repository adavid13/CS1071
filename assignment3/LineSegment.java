package assignment3;
/** Represents a line segment made up of two Cartesian points cp1 and cp2
 * 
 * @author Amir David
 *
 */
public class LineSegment {
	/**The first cartesian point of the line segment has an x-value and a y-value  */
	private CartesianPoint cp1;
	/**The second cartesian point of the line segment has an x-value and a y-value  */
	private CartesianPoint cp2;
	/**A variable with a really small value, used to represent tolerance in comparison calculations*/
	double TOLERANCE = 1E-14;
	
	
	/**Constructs a new line segment from the cartesian points
	 * 
	 * @param cp1 The first Cartesian point of the line segment 
	 * @param cp2 The second Cartesian point of the line segment 
	 */
	public LineSegment(CartesianPoint cp1, CartesianPoint cp2) {
		this.cp1 = cp1;
		this.cp2 = cp2;
		
	}
	
	/*public LineSegment(double xVal1, double yVal1, double xVal2, double yVal2) {
		
		CartesianPoint cp1 = new CartesianPoint(xVal1,yVal1);
		CartesianPoint cp2 = new CartesianPoint(xVal2,yVal2);
	}*/
	/** Returns the x and y values of the first Cartesian point
	 * 
	 * @return Returns the x and y values of the first Cartesian point
	 */
	public CartesianPoint getEnd1(){
		return cp1;
	}
	/**Returns the x and y values of the second Cartesian point
	 * 
	 * @return Returns the x and y values of the first Cartesian point
	 */
	public CartesianPoint getEnd2(){
		return cp2;
	}
	/** Returns a String representation of the Cartesian points for this line segment
	 * 
	 * @return Returns a String representation of the Cartesian points for this line segment
	 */
	public String toString() {
		return cp1.toString() +" "+ cp2.toString();
	}
	/** Returns the length of the line segment by calculating the distance between the two Cartesian points
	 * 
	 * @return Returns the length of the line segment by calculating the distance between the two Cartesian points
	 */
	public double length(){
		return cp1.distance(cp2);
	}
	/** A method that checks whether this line segment and another line segment are radii of the same circle
	 * 
	 * @param other The other line segment
	 * @return true or false if the two line segments are radii of the same circle
	 */
	public boolean areRadiiOfSameCircle(LineSegment other) {
		//comparison of the lengths of this point and point other
		boolean lenCheck = Math.abs(this.length()-other.length())<TOLERANCE;
		//check for common endpoints
		boolean ptCheck1 = Math.abs(other.cp1.getX()-cp1.getX())<TOLERANCE;
		boolean ptCheck2 = Math.abs(other.cp2.getX()-cp2.getX())<TOLERANCE;
		
		boolean ptCheck3 = Math.abs(other.cp1.getY()-cp1.getY())<TOLERANCE;
		boolean ptCheck4 = Math.abs(other.cp2.getY()-cp2.getY())<TOLERANCE;
		
		boolean ptCheck5 = Math.abs(other.cp1.getX()-cp2.getX())<TOLERANCE;
		boolean ptCheck6 = Math.abs(other.cp2.getX()-cp1.getX())<TOLERANCE;
		
		boolean ptCheck7 = Math.abs(other.cp1.getY()-cp2.getY())<TOLERANCE;
		boolean ptCheck8 = Math.abs(other.cp2.getY()-cp1.getY())<TOLERANCE;
		if(lenCheck && ((ptCheck1 && ptCheck3) || (ptCheck2 && ptCheck4) || (ptCheck5 && ptCheck7) || (ptCheck6 || ptCheck8))) {
			return true;
		}else {
			return false;
		}
	}
	/** A method that creates a new line segment that is symmetric, diagonal and opposite to origin
	 * 
	 * @return A new symmetric line segment
	 */
	public LineSegment symmetric() {
		double xNew = -(this.cp2.getX());
		double yNew = -(this.cp2.getY());
		CartesianPoint cpNew = new CartesianPoint(xNew, yNew);
		CartesianPoint orig = new CartesianPoint(0,0);
		LineSegment lsNew = new LineSegment(orig, cpNew);
		return lsNew;
		}
	
	}


