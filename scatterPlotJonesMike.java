**
   @author  Mike Jones
   @date    03/31/2015
   @class   CSC 251 N01, Spring 2015
 */

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class scatterPlotJonesMike extends Application {

	@Override
	// Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException {
		// Create a pane to hold the circle

		Pane pane = new Pane();

		Text text1 = new Text(450, 50, "Hourly Tempatures for Feburary 2015 ");// title
		// characteristics of title
		text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 24));
		
		pane.getChildren().add(text1);
		// Create a scene and place it in the stage
		
		Scene scene = new Scene(pane, 2500, 400);// dimentions of my pane
		
		primaryStage.setTitle("Ink Plotter"); // Set the stage title
		
		primaryStage.setScene(scene); // Place the scene in the stage
		
		primaryStage.show(); // Display the stage
		
		int horizontal = 35;
		
		double[] points = loadData();// call method dealing with file
		
		int number = points.length;// all the points

		for (int i = 0; i < number; i++) {// go through my array
			// Create a circle and set its properties
			
			Circle circle = new Circle();
			// TODO
		   circle.centerXProperty().bind(pane.widthProperty().divide(number+30).multiply(i).add(35));
		  
		   
		   //circle.centerYProperty().bind(pane.widthProperty().add(20));
			// TODO
		    //circle.centerYProperty().bind(pane.heightProperty().divide(number+100));
			
			//circle.setCenterX(horizontal);
			
			circle.setCenterY(300-points[i]);// bring down
			
			circle.setRadius(1);// size of circle(s)
			
			circle.setStroke(Color.BLUE);
			
			circle.setFill(Color.TURQUOISE);// colr of circle(s)
			
			pane.getChildren().add(circle);
			
			horizontal = (horizontal + 2);

		}
		Line xLine = new Line(25, 375, 25, 5);// make the x line
		
		xLine.setStroke(Color.BLACK);// color of line
		
		xLine.setStrokeWidth(3);// thickness of line
		//xLine.CenterXProperty().bind(pane.widthProperty().divide(number+20).multiply(i).add(20));
		pane.getChildren().add(xLine);// add line to pane

		Line yLine = new Line(25, 375, 2500, 375);// make the y line
		
		yLine.setStroke(Color.BLACK);// color of line
		
		yLine.setStrokeWidth(3);// thickness of line
		
		
		pane.getChildren().add(yLine);// add line to pane

	}

	
	public static void main(String[] args) {

		launch(args);//display graphics
	}

	/**
	 * opens a file and puts data into an array
	 * 
	 * @return result: all the read data
	 */
	public static double[] loadData() throws FileNotFoundException {
		// Create a File instance
		java.io.File file = new java.io.File("src/temperatures.txt");// open
																		// file
		// Create a Scanner for the file
		Scanner input = new Scanner(file);
		
		double[] myNums = new double[1000];// make array large enough for all
											// points
		// Read data from a file
		int i = 0;
		
		while (input.hasNext()) {
			myNums[i] = input.nextDouble();
			i++;
		}
		
		input.close();
		
		double[] result = new double[i];// put items in array
		
		for (int j = 0; j < i; j++) {
			result[j] = myNums[j];// populate the array
		}
		return result;
	}

}
