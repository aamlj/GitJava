package geoFormImage;
/*
@author  Mike Jones
@date    04/6/2015
@class   CSC 251 N01, Spring 2015
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

	public class AbstractArtJonesMike extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {   
		  //size of my stage
	    int width = 800;
	    int height = 800;
	   
	    
	     //create text with attributes 
	    Text text = new Text(300, 700, "Kunibert Fritz-untitled ");
	    text.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 24));
	    text.setFill(Color.WHITE);
	    
	    //create pane
	    Pane pane = new Pane();
	    
	    //Create colors
	    Color red = Color.rgb(255,37,1);
	    Color blue = Color.rgb(2,29,170);
	    Color gray = Color.rgb(145,145,145);
	    Color yellow = Color.rgb(255,252,1);
	    Color magenta = Color.rgb(255,64,255);
	    Color torquise = Color.rgb(0,120,145);
	    Color white = Color.rgb(235,235,235);
	    Color black = Color.rgb(1,1,1);
	  
	    // Create rectangles and add to pane
	    Rectangle r1 = new Rectangle(0, 0, 400, 400);
	    r1.setFill(red);
	    pane.getChildren().add(r1);
	    
	   Rectangle r2 = new Rectangle(400, 0, 400, 400);
	    r2.setFill(blue);
	    pane.getChildren().add(r2);
	    
	    Rectangle r3 = new Rectangle(400, 400, 400, 400);
	    r3.setFill(gray);
	    pane.getChildren().add(r3);
	    
	    Rectangle r4 = new Rectangle(200, 400, 100, 200);
	    r4.setFill(yellow);
	    pane.getChildren().add(r4);
	    
	    Rectangle r5 = new Rectangle(200, 500, 100, 200);
	    r5.setFill(magenta);
	    pane.getChildren().add(r5);
	    
	    Rectangle r6 = new Rectangle(200, 600, 100, 200);
	    r6.setFill(torquise);
	    pane.getChildren().add(r6);
	    
	    Rectangle r7 = new Rectangle(200, 700, 100, 200);
	    r7.setFill(white);
	    pane.getChildren().add(r7);
	    
	    Rectangle r8 = new Rectangle(300, 400, 200, 400);
	    r8.setFill(black);
	    pane.getChildren().add(r8);
	    
	    Rectangle r9 = new Rectangle(0, 400, 200, 400);
	    r9.setFill(gray);
	    pane.getChildren().add(r9);
	    
	   
	   
	    // Create a scene and place it in the stage
	   
	    BorderPane stack = new BorderPane();
	    stack.getChildren().addAll(text);
	   
	    pane.getChildren().add(stack);
	    Scene scene = new Scene(pane,width, height);
	 
	  
	    primaryStage.setTitle("Geometric art"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	 //main method to test
	  public static void main(String[] args) {
	    launch(args);
	  }
	}

