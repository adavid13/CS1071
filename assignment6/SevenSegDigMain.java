package assignment6;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * Represents the main driver class of the seven segment digit display
 * @author Amir David
 *
 */
public class SevenSegDigMain extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	HBox hbox;
	VBox vbox;
	Label label;
	private TextField textbox;
	Button button;
	String val;
	int length,dig,locx,locy;
	GridPane grid;
	SevenSegDigit digit;

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Seven Segment Display");
		locx=0;locy=0;
		hbox = new HBox();
		grid = new GridPane();
		grid.setHgap(3);
		grid.setVgap(3);
		vbox = new VBox(60);
		vbox.setMaxSize(250, 600);
		vbox.setAlignment(Pos.CENTER);
		button = new Button("Add Number");
		button.setFont(Font.font(20));
		button.setPrefSize(150,45);
		HBox hbtn = new HBox();
		hbtn.setAlignment(Pos.CENTER);
		hbtn.getChildren().add(button);
		button.setOnAction(this::onButtonClick);
		textbox = new TextField();
		textbox.setPrefSize(300, 45);
		textbox.setFont(Font.font(20));
		label = new Label("Number:");
		label.setFont(Font.font(20));
		HBox hbtxt = new HBox();
		hbtxt.setAlignment(Pos.CENTER);
		hbtxt.getChildren().add(label);
		vbox.getChildren().addAll(hbtxt,textbox,hbtn);
		hbox.getChildren().addAll(vbox,grid);
		Scene scene = new Scene(hbox,600,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void onButtonClick(ActionEvent event) {
		val = textbox.getText();
		length = val.length();
		for(int i=0;i<val.length();i++) {
			dig = (val.charAt(i) - 48) % 10;
			if(val.charAt(i)<48||val.charAt(i)>57) {
				dig = 12;
			}
			digit = new SevenSegDigit();
			digit.setValue(dig);
			grid.add(digit,locx,locy);
			locx++;
			if(locx>11) {
				locx=0;
				locy++;
			}
		}
		locx=0;
		locy++;
	}
}
