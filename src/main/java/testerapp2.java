import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage; 
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.*;      
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class testerapp2 extends Application {
public void start(Stage primaryStage) throws Exception {
	
	
	Label label1 = new Label("Name:");
	TextField textField = new TextField ();
	HBox hb = new HBox();
	hb.getChildren().addAll(label1, textField);
	hb.setSpacing(10);
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10, 10, 10, 10));
	grid.setVgap(5);
	grid.setHgap(5);
	
	/*
	
	//Defining the Name text field
	final TextField name = new TextField();
	name.setPromptText("Enter your first name.");
	name.setPrefColumnCount(10);
	name.getText();
	GridPane.setConstraints(name, 0, 0);
	grid.getChildren().add(name);
	//Defining the Last Name text field
	final TextField lastName = new TextField();
	lastName.setPromptText("Enter your last name.");
	GridPane.setConstraints(lastName, 0, 1);
	grid.getChildren().add(lastName);
	//Defining the Comment text field
	final TextField comment = new TextField();
	comment.setPrefColumnCount(15);
	comment.setPromptText("Enter your comment.");
	GridPane.setConstraints(comment, 0, 2);
	grid.getChildren().add(comment);
	//Defining the Submit button
	Button submit = new Button("Submit");
	GridPane.setConstraints(submit, 1, 0);
	grid.getChildren().add(submit);
	//Defining the Clear button
	Button clear = new Button("Clear");
	GridPane.setConstraints(clear, 1, 1);
	grid.getChildren().add(clear);
	
	
	
	
	final Label label = new Label();
	GridPane.setConstraints(label, 0, 3);
	GridPane.setColumnSpan(label, 2);
	grid.getChildren().add(label);

	//Setting an action for the Submit button
	submit.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	    public void handle(ActionEvent e) {
	        if ((comment.getText() != null && !comment.getText().isEmpty())) {
	            label.setText(name.getText() + " " + lastName.getText() + ", "
	                + "thank you for your comment!");
	        } else {
	            label.setText("You have not left a comment.");
	        }
	     }
	 });
	 
	//Setting an action for the Clear button
	clear.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	    public void handle(ActionEvent e) {
	        name.clear();
	        lastName.clear();
	        comment.clear();
	        label.setText(null);
	    }
	});
	
	*/
	
		

	}
public static void main(String[] args) {
    launch(args);
}

}
