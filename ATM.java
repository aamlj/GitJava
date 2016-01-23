//Author:Mike Jones
//a test program to simulate an ATM.


import java.util.Scanner;
import java.util.Date;
public class ATM{
   public static void main (String args[]){
      Account[]accounts = new Account[10]; //from the Account class            
      Date d = new Date();//from the date class
      String mainMenu = "Main Menu\n" +
                         "1: check balance\n" +
                         "2: withdraw $20\n" +
                         "3: deposit $20\n" +
                         "4: exit\n" +
                         "Enter a choice: ";  // create a menu
      
   
      for(int i = 0; i <= 9; i++){// assign value to all 10 arrays
      
         accounts[i] = new Account(i,100,.02,d);     
            
         
      }
      Scanner input = new Scanner (System.in);
      int n = 0;
      while (true) {// to handle invalid data
         System.out.println("Please enter your ID: ");//prompt user
         
         n = input.nextInt();
         while (n<0 || n>9){
            System.out.println("That id didn't work, please enter your ID: ");
         
            n = input.nextInt();//to handle invalid data
         }
         
         boolean isExit = true;
         
        //creates a infinite loop with the four menu options 
          while (isExit){
            System.out.print(mainMenu);
            int choice = input.nextInt();
            switch (choice) {
               case 1: System.out.println("Your balance is: $" + accounts[n].getBalance());
                  break;
               case 2: 
                 if (accounts[n].getBalance() >= 20) {//call methods from class
                     accounts[n].Withdrawal(20);
                  } 
                  else {
                     System.out.println("Insufficient Funds");
                  }
                  break;
               case 3: accounts[n].deposit(20);
                  break;
               case 4: System.out.println("Goodbye");
                  break;
               default: System.out.println("Invalid Command");
                  isExit=false;
                  break;
            }
         
         
         
         //swich based off menu
         
         
         
         
         }
      
      
      }
   }
   
   
   
   

   



}