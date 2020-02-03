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

<<<<<<< HEAD
//hello
=======
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


>>>>>>> refs/heads/lynn

public class CircleExample extends Application { 
	
	
	public void start(Stage primaryStage) throws Exception {
		
		
<<<<<<< HEAD
	    Pane pane = new Pane();
	    Circle circle1 = new Circle();
	    Circle circle2 = new Circle();

//swag
	      
	    Scene scene = new Scene(pane, 1200, 800);
	  
     
	    circle1.setCenterX(1200/3);
	    circle1.setCenterY(800/2);
=======
		
		
		Stage window = primaryStage;
		
		
		Pane pane = new Pane();		
	    Scene scene = new Scene(pane, 1620, 780);
		
	    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	    
		
		Pane pane1= new Pane();	
		Scene scene1 = new Scene(pane1, 1620, 780);
		GridPane grid1 = new GridPane();
	    grid1.setPadding(new Insets(10, 10, 10, 10));
	    grid1.setVgap(5);
	    grid1.setHgap(5);
	    
	    
	    grid1.setAlignment(Pos.CENTER);
	    
	    
	    
	    Label label1 = new Label("Number of circles");
	    GridPane.setConstraints(label1, 0, 3);
	    GridPane.setColumnSpan(label1, 2);
	    grid1.getChildren().add(label1);
>>>>>>> refs/heads/lynn

	    
	  
	    Button submit4 = new Button("2");
	    GridPane.setConstraints(submit4, 4, 3);
	    grid1.getChildren().add(submit4);
	   
	    
	    window.setX((screenBounds.getWidth() - 1620) / 2); 
	    window.setY((screenBounds.getHeight() - 780) / 2); 
	    
	    submit4.setOnAction(e -> window.setScene(scene));
	    
	    pane1.getChildren().addAll(grid1);
	     	primaryStage.setScene(scene1);
 	    	     	    primaryStage.show();
 	    	        	
 	    	        
 	    	        
 	    	
 	    	        	
 	    	        	
	 	    	       
 	    	      
	    	

	   


		/* 
	    primaryStage.setTitle("ShowCircle");
	    primaryStage.setScene(scene1);
	    primaryStage.show();
	  */
	
		
		
		
				
		
		   
	    
	    Circle circle1 = new Circle();
	    Circle circle2 = new Circle();  

	   
	  
	    circle1.setCenterX(scene.getWidth()/3);
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
	    GridPane.setConstraints(name, 30, 35);
	    grid.getChildren().add(name);
	    
	    
	    
	   	final TextField name2 = new TextField();
	    name2.setPromptText("Enter your middle name.");
	    name2.setPrefColumnCount(15);
	    name2.getText();
	    GridPane.setConstraints(name2, 32, 35); 
	    grid.getChildren().add(name2);
	    
	    
	    
	    final TextField name1 = new TextField();
	    name1.setPromptText("Enter your last name.");
	    name1.setPrefColumnCount(20);
	    name1.getText();
	    GridPane.setConstraints(name1, 50, 35);
	    grid.getChildren().add(name1);
	    
	    
	    final TextField Title = new TextField();
	    Title.setPromptText("Title1");
	    Title.setPrefColumnCount(20);
	    Title.getText();
	    GridPane.setConstraints(Title, 31, 0);
	    grid.getChildren().add(Title);
	    Title.setAlignment(Pos.CENTER);
	    
	    
	    
	    final TextField Title1 = new TextField();
	    Title1.setPromptText("Title");
	    Title1.setPrefColumnCount(20);
	    Title1.getText();
	    GridPane.setConstraints(Title1, 36, 0);
	    grid.getChildren().add(Title1);
	    Title1.setAlignment(Pos.CENTER); 
	    
	    
	    
	    // name1.setAlignment(Pos.CENTER); 
	 

	    
	    Button submit = new Button("Submit");
	    GridPane.setConstraints(submit, 31, 35);
	    grid.getChildren().add(submit);
	    
	    /*
	    
	    submit.setOnAction(new EventHandler<ActionEvent>() {

	    	
	    	
	    	@Override
	    	    public void handle(ActionEvent e) {
	    	        if ((name.getText() != null && !name.getText().isEmpty())) {
	    	        	
	    	        	
	    	        	
	    	            label.setText(name.getText() + " " + lastName.getText() + ", "
	    	                + "thank you for your comment!");
	    	        } else {
	    	            label.setText("You have not left a comment.");
	    	        }
	    	     }
	    	 });
	    */
	    	
	    	
	    
	    
	    Button submit1 = new Button("Submit1");
	    GridPane.setConstraints(submit1, 32, 35);
	    grid.getChildren().add(submit1);  
	    
	    
	    Button submit2 = new Button("Submit2");
	    GridPane.setConstraints(submit2, 51, 35);
	    grid.getChildren().add(submit2);
	    
	    
	    
	    
	    
	    
	    
	    pane.getChildren().addAll(circle1,circle2,grid);
	    


	  
	    primaryStage.setTitle("ShowCircle");
	   // primaryStage.setScene(scene);;
	
	
	
	    
	    
	    
	    
}

	
	public static void main(String[] args) {
	    launch(args);
	}
}