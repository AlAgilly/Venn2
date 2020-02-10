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
import javafx.scene.layout.AnchorPane;
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



public class CircleExample extends Application { 
	
	
	public static void main(String[] args) {
	    launch(args);
	}
	
	
	public void start(Stage primaryStage) throws Exception {
		
		
					
		primaryStage.setMaximized(true);
		Pane pane = new Pane();		
	    Scene scene = new Scene(pane, 1620, 780);
	    
		
	    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	    
		
		Pane pane1= new Pane();	
		Scene scene1 = new Scene(pane1, 1620, 780);
		
		
		
		
		GridPane grid1 = new GridPane();
	    grid1.setPadding(new Insets(10, 10, 10, 10));
	    grid1.setVgap(5);
	    grid1.setHgap(5);
	    
	   
	    
	    
	    Label label1 = new Label("Number of circles");
	    GridPane.setConstraints(label1, 0, 3);
	    GridPane.setColumnSpan(label1, 2);
	    grid1.getChildren().add(label1);

	    
	  
	    Button submit4 = new Button("2");
	    GridPane.setConstraints(submit4, 4, 3);
	    grid1.getChildren().add(submit4);
	   

	    
	    submit4.setOnAction(f -> {
	    primaryStage.setMaximized(true);
	
	    primaryStage.setScene(scene);
	    
	    }
	    );
	    
	  
	    
	    
	    
	    pane1.getChildren().addAll(grid1);
	  
	     	primaryStage.setScene(scene1);
	     	  primaryStage.setMaximized(true);
 	    	     	    primaryStage.show();
 	    	        	
 	    	        
 	    	        
 	    
		   
	    
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
	    name.setPromptText("Enter your object");
	    name.setPrefColumnCount(20);
	    
	    GridPane.setConstraints(name, 50, 20);
	    
	    
	    
	   	final TextField name1 = new TextField();
	    name1.setPromptText("Enter your object2");
	    name1.setPrefColumnCount(15);
	    GridPane.setConstraints(name1, 70, 20);
	    
	    
	    final TextField name2 = new TextField();
	    name2.setPromptText("Enter your object 3");
	    name2.setPrefColumnCount(20);
	    GridPane.setConstraints(name2, 90, 20);
	
	    grid.getChildren().addAll(name,name1,name2);
	    
	    
	   
	    
	    
	    
	    
		    
	    //Titles
	    
	    GridPane grid3 = new GridPane();
	    
	    grid3.setPadding(new Insets(10, 10, 10, 10));
	    grid3.setVgap(5);
	    grid3.setHgap(5);
	    
	    	    
	    final TextField Title = new TextField();
	    Title.setPromptText("Title");
	    Title.setPrefColumnCount(20);
	    Title.getText();
	   GridPane.setConstraints(Title, 72, 0);
	  //  grid.getChildren().add(Title);
	    Title.setAlignment(Pos.CENTER);
	    
	    
	    
	    final TextField Title1 = new TextField();
	    Title1.setPromptText("Title1");
	    Title1.setPrefColumnCount(20);
	    Title1.getText();
	  GridPane.setConstraints(Title1, 90, 0);
	  //  grid.getChildren().add(Title1);
	    Title1.setAlignment(Pos.CENTER); 
	    
	    
	    
	 
	 //   grid2.setPadding(new Insets(5, 5, 5, 5));
	  //  grid2.setVgap(5);
	  //  grid2.setHgap(5);
	    
	    grid3.getChildren().addAll(Title,Title1);
	    
	 //   grid2.add(Title, 75,0);
	  //  grid2.add(Title1,79,0);
	    
	    
	  //  grid2.add(name, 70,40);
	  //  grid2.add(name1, 75, 40);
	   // grid2.add(name2, 80, 40);

	  
	   
	    
	    GridPane grid2 = new GridPane();
	    grid2.setPadding(new Insets(10, 10, 10, 10));
	    grid2.setVgap(5);
	    grid2.setHgap(5);
	    
	    
	    Button submit = new Button("Submit");
	    GridPane.setConstraints(submit, 100, 20);
	    String input = name.getText();
	    grid2.getChildren().add(submit);

	    
	    /*
	    
	    final Label label = new Label(input);
	    GridPane.setConstraints(label, 0, 3);
	    GridPane.setColumnSpan(label, 2);
	   grid1.getChildren().add(label);


	    
	    
	    submit.setOnAction(e -> 
	    {
	        
	    label.setText("The name you entered is " + name.getText());
	            }
	    );
	    */

	 
	    Button submit1 = new Button("Submit1");
	  GridPane.setConstraints(submit1, 145, 20);
	  grid2.getChildren().add(submit1);

	    
	    Button submit2 = new Button("Submit2");
	    GridPane.setConstraints(submit2, 200, 20);
	    grid2.getChildren().add(submit2);
	    
	    
	    StackPane pane_s = new StackPane();
	 
	    pane_s.getChildren().addAll(grid,grid2,grid3);



	   /*
	    grid.add(submit, 110,20);
	    grid.add(submit1,150,20);
	    grid.add(submit2, 200, 20);
	  
*/
	 AnchorPane circles= new AnchorPane();
	 
	 circles.getChildren().addAll(circle1,circle2);
	 
	    
	    
	    
	    
	    primaryStage.setMaximized(true);
	    
   pane.getChildren().addAll(circles,pane_s);

   	     	    primaryStage.show();
	    

	 
	 
}

	
	
}