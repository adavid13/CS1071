package assignment6;
/** Represents a Segment of type VerticalSegment
 * 
 * @author Amir David
 *
 */
public class VerticalSegment extends Segment {
	/**constructs a VerticalSegment
	 * sets the size of the segment to 5 wide and 25 high
	 */
	public VerticalSegment() {
		this.setMaxSize(5, 25);
		this.setMinSize(5, 25);
	}
}
