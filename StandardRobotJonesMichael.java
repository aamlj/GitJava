/**
    A StandardRobot is a Robot with the standard movement strategy.

    At each time-step, a StandardRobot attempts to move in its current direction; when
    it hits a wall, it chooses a new direction randomly.
*/
public class StandardRobot extends Robot {
    public StandardRobot(RectangularRoom room, double speed){
        super(room, speed);
    }
    
    @Override
    public void updatePositionAndClean () {
        /*
         * Simulate the passage of a single time-step.
         *
         * Move the robot to a new position and mark 
         * the tile it is on as having been cleaned.
        */    
    }
}