/**
    Represents a Robot cleaning a particular room.

    At all times the robot has a particular position and direction in the room.
    The robot also has a fixed speed.

    Robot should provide movement strategies by implementing 
    updatePositionAndClean(), which simulates a single time-step.

    @author     Michael Jones
    @org        Cape Fear Community College
    @data       3/17/2015
    @class      CSC 251 N01

*/
public abstract class Robot {
    // Class Variables
    private RectangularRoom room;
    private double speed = 1;
    private Position pos;
    private int direction;

    // Constructors
    /**
        Initializes a Robot with the given speed in the specified room. The
        robot initially has a random direction and a random position in the
        room. The robot cleans the tile it is on.

        @param room:  a RectangularRoom object.
        @param speed: a double (speed > 0)
    */
    public Robot (RectangularRoom room, double speed) {
        throw new UnsupportedOperationException("Remove this line and implement this!");
    }

    // Class Methods
    /**
        Return the position of the robot.

        @returns: a Position object giving the robot's position.
    */
    public Position getRobotPosition () {
        throw new UnsupportedOperationException("Remove this line and implement this!");
    }

    /**
        Return the direction of the robot.

        @returns: an integer d giving the direction of the robot as an angle in
        degrees, an integer 0 <= d < 360.
    */
    public int getRobotDirection () {
        throw new UnsupportedOperationException("Remove this line and implement this!");
    }

    /**
        Set the position of the robot to pos.

        @param pos: a Position object.
    */
    public void setRobotPosition (Position pos) {
        throw new UnsupportedOperationException("Remove this line and implement this!");
    }

    /**
        Set the direction of the robot to direction.

        @param direction: integer representing an angle in degrees
    */
    public void setRobotDirection (int direction) {
        throw new UnsupportedOperationException("Remove this line and implement this!");
    }

    /**
        Simulate the passage of a single time-step.
        Move the robot to a new position and mark the tile it is on as having
        been cleaned.
        At each time-step, a Robot attempts to move in its current direction;
        when it would hit a wall, it chooses a new direction at random instead
        This method is abstract and should not be implemented in this class.
    */
    public abstract void updatePositionAndClean ();
}