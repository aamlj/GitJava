//Author: Mike Jones                                        
// The game of Tic Tac Toe played in the console

/* need a method to draw the board, a method to get the moves of the players with strings for the row and column. one boolean
to make sure it is an integer entered and is between 1 and 3. And a boolean to determine if the move has been made already.
Gonna need a method to determine the status of the game and check for a winner.*/

import java.util.Scanner;
 
public class TicTacToe {
       
   static int x; // Row number of the last move.
   static int y; // Column number coordinate of the last move.
   static String curPlayer = "O";  //Indicate the current player (X or O).
   static String winningPlayer = "";  //The winning player.  If blank, then game is a draw.
   static boolean gameOver = false;  //Indicate if the game is finished.
   static String[][] board = new String[3][3];  // Array to record player moves.
   static int numMoves = 0; //Counter to keep the number of moves.  Only 9 moves are possible
                                 //in a 3 X 3 board of tic tac toe.
   static int sizeOfBoard = 3;  //Number of rows and columns in the board.
       
   public static void main(String[] args) {
                  
      drawBoard();
                  
      while (gameOver==false) {  // While the game is not over.
         getNextMove();  // Get the player's move.
         drawBoard();  // Re-draw the board.
         checkGameStatus();  // Check if anyone has won.
      }
      if (winningPlayer == "")  // If a winning player wasn't set, then the game ended in a draw.
         System.out.println("The game ended in a draw.");
      else //Otherwise, display the winning player.
         System.out.println("Player " + winningPlayer + " won the game.");
   }
 
   public static void drawBoard() {// use some strings here to make blocks for the gameboard
      String topBlock = "-------";
      String bottomBlock = "|        ";
                  
      for (int i = 0; i <= sizeOfBoard; i++) {
         for (int j = 0; j <= sizeOfBoard; j++) {
            System.out.print(topBlock);
         }
         System.out.printf("\n");
         if (i < sizeOfBoard) {
            for (int k = 0; k <= sizeOfBoard; k++) {
               if (i < sizeOfBoard && k < sizeOfBoard) {
                                                   // if a move has previously been recorded, then display it.
                  if (board[i][k] == "X" || board[i][k] == "O")
                     System.out.print("|   " + board[i][k] + "    ");
                  else
                                                           // Display blank board cell.
                     System.out.print(bottomBlock);
               }
               else
                  System.out.print(bottomBlock);
                                                          
            }
            System.out.printf("\n");
         }
      }
   }
          
   public static void getNextMove () {
      Scanner input = new Scanner(System.in);
      String strRow = "";
      String strColumn = "";
      boolean validEntry = false;
      boolean getValidMove = true;
                       
      x = 0;
      y = 0;
                       
                        // Switch players on every move.
      if (curPlayer == "X") {
         curPlayer = "O";
      }
      else {
         curPlayer = "X";
      }
                          
      while (getValidMove) {
                          
                           //Get the row for the player.
         validEntry = false;
                                
         while (validEntry==false) {
            System.out.print("Enter a row for player " + curPlayer + ": ");// use a boolean here to make sure the input is valid
            strRow = input.next();
            if (isIntegerParseInt(strRow)==false) {
               System.out.println("The number " + strRow + " is not a valid number.");
            }
            else {
               x = Integer.parseInt(strRow) - 1;
                                       
               if (x < 0 || x > sizeOfBoard - 1) {
                  System.out.println("The row number needs to be in the range of 1 to " + sizeOfBoard + ".");
               }
               else
                  validEntry = true;
            }
         }
                               
                                 //Get the column for the player.
                               
         validEntry = false;
                               
         while (validEntry==false) {
            System.out.print("Enter a column for player " + curPlayer + ": ");
            strColumn = input.next();
            if (isIntegerParseInt(strColumn)==false) {
               System.out.println("The number " + strColumn + " is not a valid number.");
               input.next();                                  
            }
            else {
               y = Integer.parseInt(strColumn) - 1;
                                       
               if (y < 0 || y > sizeOfBoard - 1) {
                  System.out.println("The column number needs to be in the range of 1 to " + sizeOfBoard + ".");
               }
               else
                  validEntry = true;
            }
         }
                               
                                // Check to see if the move was previously recorded.
         if (board[x][y] == "X" || board[x][y] == "O") {
            System.out.println("The move row = " + (x + 1) + " and column = " + (y + 1) + " has already been recorded.");
            getValidMove = true;
         }
         else
            getValidMove = false;
      }
                  
                        // Record the player's move.
      board[x][y] = curPlayer;
                       
                        // Increment the number of moves so far.
      numMoves++;
                  
   }
          
   public static boolean isIntegerParseInt(String str) {
      try {
         Integer.parseInt(str);
         return true;
      } 
      catch (NumberFormatException nfe) {}
      return false;
   }
 
   public static void checkGameStatus() {
                 // A winning move can only be in a line contiguous with the last move a player
                 // made.  Therefore, only need to check the contiguous column line, row line, and
                 // possibly diagonal line to determine if someone has won.
                
                 //check column line
      for(int i = 0; i < sizeOfBoard; i++){
         if(board[x][i] != curPlayer)
            break;
         if(i == sizeOfBoard-1){
            winningPlayer = curPlayer;
            gameOver = true;
         }
      }
   
      if(gameOver==false) {
                         //check row line
         for(int i = 0; i < sizeOfBoard; i++){
            if(board[i][y] != curPlayer)
               break;
            if(i == sizeOfBoard-1){
               winningPlayer = curPlayer;
               gameOver = true;
            }
         }
      }
   
      if (gameOver==false) {
                         //check one diagonal line.
         if(x == y){
                                 //we're on a diagonal
            for(int i = 0; i < sizeOfBoard; i++){
               if(board[i][i] != curPlayer)
                  break;
               if(i == sizeOfBoard-1){
                  winningPlayer = curPlayer;
                  gameOver = true;
               }
            }
         }
      }
                
      if (gameOver==false) {
                    //check the other diagonal line.
         for(int i = 0;i<sizeOfBoard;i++){
            if(board[i][(sizeOfBoard-1)-i] != curPlayer)
               break;
            if(i == sizeOfBoard-1){
               winningPlayer = curPlayer;
               gameOver = true;
            }
         }
      }
   
      if (gameOver==false) {
                         //check for a draw
                         // Only the sizeOfBoard squared moves can be made in total.  If this number
                         // is reached, then the game is a draw.
         if(numMoves == (sizeOfBoard * sizeOfBoard)){
            gameOver = true;
         }
      }
                
   }
}
