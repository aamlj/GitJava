//built out rectangular room;

/**
    A RectangularRoom represents a rectangular region containing clean or dirty
    tiles.

    A room has a width and a height and contains (width * height) tiles. At any
    particular time, each of these tiles is either clean or dirty.

    @author     Michael Jones
    @org        Cape Fear Community College
    @data       3/17/2015
    @class      CSC 251 N01

*/
public class RectangularRoom {
    // Class Variables
   private int width;
   private int height;
   private boolean[][] tiles;

    // Constructors
    /**
        Initializes a rectangular room with the specified width and height.//make a two dimensional array(dirty room)

        Initially, no tiles in the room have been cleaned. The variable, tiles,
        should be created as a 2D array with [width][height] size. Each element
        inside the array should be initialized to false (indicating not clean).

        @param width: an integer > 0
        @param height: an integer > 0
    */
   public RectangularRoom(int width, int height) {
      this.width = width;
      this.height = height;
      this.tiles = new boolean [width] [height];    
     
      // use nested for loops
   //dirtying the floor
   
      for(int row = 0;row < height; row++){
         for(int col = 0; col< width; col++){
            tiles[row][col] = false;//inner loop runs all col are first row not changed at all goes through same thing until all done
         							// every method should be less than 10 lines
         }
      }
   }	
		
   public int getWidth(){
    
      return this.width;
   }
   public int getHeight() {
    
      return this.height;
    
   }

    // Class Methods
    /**
        Mark the tile under the position pos as cleaned.
        Assumes that pos represents a valid position inside this room.
        Since pos may contain doubles, cast pos.getX() and .getY() as ints.

        @param pos: a Position
    */
   public void cleanTileAtPosition(Position pos) { //int x = pos.get x()
        //mark tile under pos
      int x = (int)pos.getX();
      int y = (int)pos.getY();
      tiles[x][y] = true;
   }

    /**
        Return True if the tile [m][n] has been cleaned.
        Assumes that [m][n] represents a valid tile inside the room.

        @param m: an integer
        @param n: an integer
        @returns: True if [m][n] is cleaned, False otherwise
    */
   public boolean isTileCleaned(int m, int n) {
      return tiles[m][n];
   }

    /**
        Return the total number of tiles in the room.

        @returns: an integer
    */
   public int getNumTiles() {
      return width * height;
   }

    /**
        Return the total number of clean tiles in the room.

        @returns: an integer
    */
   public int getNumCleanedTiles() {
      int count = 0;
      for(int row = 0; row < height; row++){
         for(int col = 0; col< width; col++){
            if(tiles[row][col]==true){
               count++;
            }
         }
      }
      return count;
   }

    /**
        Return a random Position inside the room.
            x should be less the width, but greater than 0
            y should be less the height, but greater than 0

        @returns: a Position
    */
   public Position getRandomPosition() {
      double x = Math.random()* width;
      double y = Math.random()* height;
      Position p = new Position(x,y);
      return p;
   }

    /**
        Return True if pos is inside the room.
        @param pos: a Position object
        @returns: True if pos is in the room, False otherwise.
    */
   public boolean isPositionInRoom(Position pos) {
      double x = pos.getX();
      double y = pos.getY();
   	
      boolean validX = (x > 0) && (x < this.width);
      boolean validY = (y > 0) && (y < this.height);
   	
      return validX && validY;
   }
}