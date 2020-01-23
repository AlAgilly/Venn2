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
	    
	    
	    
	    pane.getChildren().addAll(circle1,circle2);
	    
	    TextField userTextField = new TextField();
        userTextField.setPrefWidth(800);
        primaryStage.setScene(new Scene(userTextField));
        primaryStage.show();

	  
	    primaryStage.setTitle("ShowCircle");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    
	}

	
	public static void main(String[] args) {
	    launch(args);
	}
}