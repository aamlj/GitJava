/*
@author  Mike Jones
@date    04/21/2015
@class   CSC 251 N01, Spring 2015
*/



package week14;

import javafx.application.Application;//import statements
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import java.util.Random;
public class ColorChangerJonesMike extends Application{
//Button c;
	@Override
	public void start(Stage primaryStage)  {
		Random random = new Random();//randomize the colors
		Circle c = new Circle();//create new circle
		Pane pane = new Pane();//create new pane
		Text text = new Text(""); //create new text
		pane.getChildren().add(text);//put text on pane
		c.setCenterX(125);//centers the circle
		c.setCenterY(125);
		c.setOnMouseClicked(e->{//lambda expression
			int red = (int)(random.nextInt(256));
			int blue = (int)(random.nextInt(256));
			int green = (int)(random.nextInt(256));
			  Color rand = Color.rgb( red,green,blue );//random colors
			  c.setFill(rand);
			 String newText = ("Current Color "+red+", "+blue+", "+ green);//display changes
			 text.setText(newText); 
			  
		});
	c.setRadius(100);//size of circle
	BorderPane borderPane = new BorderPane();
	borderPane.setCenter(pane);
	borderPane.setBottom(text);
	pane.getChildren().addAll(c);//add circle to the pane
	
	
	Scene scene = new Scene(borderPane,250,250);//create my scene
	
	primaryStage.setTitle("Color Circle Changer");//title of scene
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
public static void main(String[]args){//tester
	launch(args);
}

}