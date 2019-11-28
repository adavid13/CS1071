package assignment6;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**Represents a single seven segment digit
 * 
 * @author amir1
 *
 */
public class SevenSegDigit extends VBox {
	private HorizontalSegment a = new HorizontalSegment();
	private VerticalSegment b = new VerticalSegment();
	private VerticalSegment c = new VerticalSegment();
	private	HorizontalSegment d = new HorizontalSegment();
	private	 VerticalSegment e = new VerticalSegment();
	private	 VerticalSegment f = new VerticalSegment();
	private	 HorizontalSegment g = new HorizontalSegment();
	 BorderPane borderPane1 = new BorderPane();
	 BorderPane borderPane2 = new BorderPane();
	int digit,length,dig,locx=0,locy;
	double val;
	/**Constructs a new seven segment digit
	 * attaches the digits to border panes
	 */
	public SevenSegDigit() {
		borderPane1.setTop(a);
		borderPane1.setLeft(f);
		borderPane1.setRight(b);
		borderPane1.setBottom(g);
		this.getChildren().add(borderPane1);
		borderPane2.setLeft(e);
		borderPane2.setBottom(d);
		borderPane2.setRight(c);
		borderPane2.setMaxSize(25, 25);
		borderPane2.setMinSize(5, 5);
		this.getChildren().add(borderPane2);
	}
	/**
	 * Receives a digit value and turns on the appropriate segments to display the digit
	 * @param dig the individual digit to be displayed
	 */
	public void setValue(int dig) {
		locx=0;
		a.off();b.off();c.off();d.off();e.off();f.off();g.off();
			switch(dig) {
			case 12: a.on();e.on();f.on();g.on();d.on();break;
			case 0: a.on();b.on();c.on();d.on();e.on();f.on();break;
			case 1: b.on(); c.on(); break;
			case 2: a.on();b.on();g.on();e.on();d.on();break;
			case 3: a.on();b.on();c.on();d.on();g.on();break;
			case 4: b.on();g.on();f.on();c.on();;break;
			case 5: a.on();f.on();g.on();c.on();d.on();break;
			case 6: f.on();g.on();c.on();d.on();e.on();;break;
			case 7: a.on();b.on();c.on();break;
			case 8: a.on();b.on();c.on();d.on();e.on();f.on();g.on();break;
			case 9: a.on();b.on();c.on();g.on();f.on();break;
			default: a.on();d.on();g.on();e.on();f.on();break;
		}
	}
}
