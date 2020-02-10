import javafx.application.Application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
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



public class Testapp extends Application { 
	
	
	public static void main(String[] args) {  
		launch(args);     
		}  
		  
	
	
	public void start(Stage primaryStage) throws Exception {
		
 
		 
		 
		   	Label user_id=new Label("User ID");  
		    Label password = new Label("Password");  
		    TextField tf1=new TextField();  
		    TextField tf2=new TextField();  
		    Button b = new Button("Submit");  
		    b.setOnAction(e->System.out.println("You entered: User_ID: "+tf1.getText()+""+"Password: "+tf2.getText()));  
		    Label input = new Label (tf1.getText());
		    
		    GridPane root = new GridPane();  
		   
		    root.addRow(0, user_id, tf1);  
		    root.addRow(1, password, tf2);  
		    root.addRow(2, b);  
		    root.addRow(5, input);
		    Scene scene=new Scene(root,300,200);  
		    primaryStage.setScene(scene);  
		    primaryStage.setTitle("Text Field Example");  
		    primaryStage.show();  
	}
}