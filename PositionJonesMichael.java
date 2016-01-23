/**
    A Position represents a location in a two-dimensional room.

    

    @author     Michael Jones
    @org        Cape Fear Community College
    @data       3/17/2015
    @class      CSC 251 N01
    
*/
public class Position {
    // Class Variables
    private double x, y;

    // Constructor
    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Getters for X and Y
    public double getX() {return this.x;}
    public double getY() {return this.y;}

    /**
        Computes and returns the new Position after a single clock-tick has
        passed, with this object as the current position, and with the
        specified angle and speed.

        Does NOT test whether the returned position fits inside the room.

        @param angle: double representing angle in degrees, 0 <= angle < 360
        @param speed: a positive double representing speed

        @returns: a Position object representing the new position.
    */
    public Position getNewPosition(double angle, double speed) {
        double old_x = this.getX();
        double old_y = this.getY();
        // Compute the change in position
        double delta_y = speed * Math.cos(Math.toRadians(angle));
        double delta_x = speed * Math.sin(Math.toRadians(angle));
        // Add that to the existing position
        double new_x = old_x + delta_x;
        double new_y = old_y + delta_y;
        return new Position(new_x, new_y);
    }

    // String Representation of a Position object
    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }

    public static void main(String[] args) {
        Position origin = new Position(0, 0);
        System.out.println(origin);
    }
}