package assignment6;
import javafx.scene.control.Label;
/**Represents a segment of the seven segment digit display  
 * 
 * @author Amir David
 *
 */
public class Segment extends Label {
	/**
	 * Changes the colour of the segment to red
	 */
	public void on() {
		this.setStyle("-fx-background-color: red;");
	}
	/**
	 * Changes the colour of the segment to grey
	 */
	public void off() {
		this.setStyle("-fx-background-color: lightgray;");
	}
}
