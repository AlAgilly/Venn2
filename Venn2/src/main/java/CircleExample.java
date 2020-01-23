import javafx.application.Application;
import javafx.collections.ObservableList;
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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CircleExample extends Application { 
	
	
	public void start(Stage primaryStage) {
		
		
		
		
		Pane pane = new Pane();		
	    Scene scene = new Scene(pane, 1200, 800);
	    
	    
	    Circle circle1 = new Circle();
	    Circle circle2 = new Circle();  

	   
	  
	    circle1.setCenterX(pane.getWidth()/3);
	    circle1.setCenterY(800/2);
	    
	    
	    circle1.setRadius(350);
	    circle1.setStroke(Color.RED);
	    circle1.setFill(null);
	    circle1.setStrokeWidth(5);

	   
	    circle2.setCenterX(800);
	    circle2.setCenterY(800/2);
	    
	    
	    
	    circle2.setRadius(350);
	    circle2.setStroke(Color.BLUE);
	    circle2.setFill(null);
	    circle2.setStrokeWidth(5);
	    
	    
	    
	   
	    
	    GridPane grid = new GridPane();
	    
	    grid.setPadding(new Insets(10, 10, 10, 10));
	    grid.setVgap(5);
	    grid.setHgap(5);
	    
	    final TextField name = new TextField();
	    name.setPromptText("Enter your first name.");
	    name.setPrefColumnCount(20);
	    name.getText();
	    GridPane.setConstraints(name, 40, 40);
	    grid.getChildren().add(name);
	    
	    final TextField name1 = new TextField();
	    name1.setPromptText("Enter your last name.");
	    name1.setPrefColumnCount(20);
	    name1.getText();
	    GridPane.setConstraints(name1, 70, 40);
	    grid.getChildren().add(name1);
	
	    
	    final TextField name2 = new TextField();
	    name2.setPromptText("Enter your middle name.");
	    name2.setPrefColumnCount(15);
	    name2.getText();
	    GridPane.setConstraints(name2, 52, 40);
	    grid.getChildren().add(name2);
	    
	    
	    
	    
	    pane.getChildren().addAll(circle1,circle2,grid);
	    


	  
	    primaryStage.setTitle("ShowCircle");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    
	}

	
	public static void main(String[] args) {
	    launch(args);
	}
}