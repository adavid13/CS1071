package assignment6;
/**
 * Represents a Segment of type HorizontalSegment
 * @author Amir David
 *
 */
public class HorizontalSegment extends Segment{
	/**constructs a HorizontalSegment
	 * sets the size of the segment to 25 wide and 5 high
	 */
	public HorizontalSegment() {
		this.setMaxSize(25, 5);
		this.setMinSize(25, 5);
	}
}
