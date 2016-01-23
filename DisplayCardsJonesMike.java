package card;
/*
@author  Mike Jones
@date    04/26/2015
@class   CSC 251 N01, Spring 2015
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

	public class DisplayCardsJonesMike extends Application  {
		@Override
		public void start(Stage primaryStage)  {
	  //DeckJonesMike deck = new DeckJonesMike();//create my deck
	  
	  
	  
	 // CardJonesMike c1 = deck.drawCard();//draw the first card
	 // CardJonesMike c2 = deck.drawCard();//draw the second card
	 
	// Create a pane to hold the cards
	    Pane pane = new HBox(2);//one box for each png file
	    pane.setPadding(new Insets(5, 5, 5, 5));//set padding to fit the png files together
	    //Image image = new Image(c1.getFilename());//get the first card
	   // pane.getChildren().add(new ImageView(image));// add the card
	    
	   // Image image2 = new Image(c2.getFilename());//get the second card
	    //pane.getChildren().add(new ImageView(image2));  //add the second card 
	  
     Button btnRefresh = new Button("Refresh");//create the refresh button
	 btnRefresh.setOnAction(e->{pane.getChildren().clear();//lamda expression to clear scene 
	 //CardJonesMike c3 = deck.drawCard();//add a new card from deck
	 //CardJonesMike c4 = deck.drawCard();//add a another new card from deck
	 
	 // Image image3 = new Image(c3.getFilename());//get the image for the new card
	   // pane.getChildren().add(new ImageView(image3));//add new card to the scene
	    
	 // Image image4 = new Image(c4.getFilename());//get the image for the other new card
	    //pane.getChildren().add(new ImageView(image4));   //add new card to the scene
	 
	 });   
	 
	 BorderPane displayPane = new BorderPane();
	  displayPane.setBottom(btnRefresh);//put the button on the bottom of the pane
	  displayPane.setCenter(pane);// and the center of the pane
	    
	  
	    Scene scene = new Scene(displayPane);// Create a scene and place it in the stage
	    primaryStage.setTitle("ShowImage"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
		
        public static void main(String[] args){
			launch(args);
		}
	}

	  
	 
	  //File f = new File("src\\" + c1.getFilename());
		 // System.out.println(f.exists() + " " + f.getAbsolutePath());
