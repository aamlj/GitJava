/**


    @author     Michael Jones
    @org        Cape Fear Community College
    @data       3/17/2015
    @class      CSC 251 N01
    
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.util.*;
import java.util.Map;

public class VisualizeSimulation extends Application {
	@Override
	public void start (Stage primaryStage) {
		Parameters parameters = getParameters();
		Map<String, String> params = parameters.getNamed();
		int numberOfBots 	= 1;
		int roomWidth 		= 5;
		int roomHeight 		= 5;
		String robotType 	= "standard";

		if (params.containsKey("bots"))
			numberOfBots = Integer.parseInt(params.get("bots"));
		if (params.containsKey("width"))
			roomWidth = Integer.parseInt(params.get("width"));
		if (params.containsKey("height"))
			roomHeight = Integer.parseInt(params.get("height"));
		if (params.containsKey("bot-type"))
			robotType = params.get("bot-type");

		int width = roomWidth * RoomPanel.TILESIZE;
		int height = roomHeight * RoomPanel.TILESIZE;
		RectangularRoom room = new RectangularRoom(roomWidth,roomHeight);
		Robot[] robots = new Robot[numberOfBots];
		for (int i=0; i < numberOfBots; i++) {
			Robot roomba;
			if (robotType.equals("random")){
				roomba = new RandomRobot(room, 1);
			} else {
				roomba = new StandardRobot(room, 1);
			}
			robots[i] = roomba;
		}
		RoomPanel panel = new RoomPanel(room, robots);
		EventHandler<ActionEvent> eventHandler = e -> {
			panel.paintRoom();
		};

		Timeline animation = new Timeline(
			new KeyFrame(Duration.millis(500), eventHandler));
		animation.setCycleCount(10000);
		animation.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Simulation Complete");
				int totalTiles = room.getNumTiles();
				int cleanTiles = room.getNumCleanedTiles();
				System.out.println("Total Tiles:\t" + totalTiles);
				System.out.println("Clean Tiles:\t" + cleanTiles);
				System.out.printf("%% Cleaned:\t%.2f%%\n",(100.0*cleanTiles/totalTiles));
			}
		});
		animation.play();

		Scene scene = new Scene(panel, width, height);
		primaryStage.setTitle("Roomba Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
class RoomPanel extends Pane {
	private int hour;
	private int minute;
	private int second;
	private RectangularRoom room;
	private Robot[] robots;

	// width and height
	private double w = 500, h = 500;
	public static final int TILESIZE = 50;

	/** 
		Construct a default clock w/ current time
	**/
	public RoomPanel (RectangularRoom room, Robot[] robots) {
		this.room = room;
		w = room.getWidth() * 100;
		h = room.getHeight() * 100;
		this.robots = robots;
		paintRoom();
	}

	/** 
		Construct a default clock w/ current time
	**/
	public RoomPanel () {
		paintRoom();
	}

	protected void paintRoom() {
		getChildren().clear();

		double centerX = w / 2;
		double centerY = h / 2;

		int rows = (int)(h / 100);
		int cols = (int)(w / 100);
		
		if (robots != null) {
			for (Robot roomba : robots) {
				roomba.updatePositionAndClean();
			}
		}

		for (int x=0; x < cols ; x++) {
			for (int y = 0; y < rows; y++) {
				Rectangle rect = new Rectangle(x * TILESIZE, y * TILESIZE,
											   TILESIZE, TILESIZE);
				if (!room.isTileCleaned(x,y))
					rect.setFill(Color.GRAY);
				else
					rect.setFill(Color.WHITE);
				rect.setStroke(Color.DARKGRAY);
				getChildren().add(rect);
			}
		}

		if (robots != null) {
			for (Robot roomba : robots) {
				double length = 40;
				double arcX = roomba.getRobotPosition().getX()*TILESIZE;
				double arcY = roomba.getRobotPosition().getY()*TILESIZE;
				double arcRadiusX = 35;
				double arcRadiusY = 35;
				int offset = 70;
				double startAngle = (roomba.getRobotDirection()+offset)%360;
				Arc arc = new Arc(arcX, arcY, arcRadiusX, arcRadiusY, startAngle, length);
				arc.setFill(Color.RED);
				arc.setType(ArcType.ROUND);
				getChildren().add(arc);
				// System.out.println("Position: " + roomba.getRobotPosition());
				// System.out.println("Direction: " + roomba.getRobotDirection());
			}
		}
	}
}