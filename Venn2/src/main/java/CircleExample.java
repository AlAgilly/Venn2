import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.*;      
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;


public class CircleExample extends Application { 
	
	
	public void start(Stage primaryStage) {
		
		
	    Pane pane = new Pane();
	    Circle circle1 = new Circle();
	    Circle circle2 = new Circle();


	      
	    Scene scene = new Scene(pane, 1200, 800);
	  
     
	    circle1.setCenterX(1200/3);
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
	    
	    
	 
	    pane.getChildren().addAll(circle1, circle2);

	  
	    primaryStage.setTitle("ShowCircle");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

	public static void main(String[] args) {
	    launch(args);
	}
}