//Author: Mike Jones
// password validator using regular expressions


import java.util.Scanner;

public class PasswordValidator{
   public static void main (String [] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Your Password Here: ");// input from user
     String s = input.nextLine( );
    

      validPassword(s);
     
   
   
   }
   public static String validPassword(String s){
      String isValid = " ";
   
  if (s.matches("^[a-zA-Z]+[a-zA-Z 0-9!@#$%^&*()]{8,}[a-zA-Z0-9!@#$%^&*()]^*")){//Start with a letter (upper or lower case)
                                                                                //Be at least 8 characters lo
                                                                                //The password may contain numbers, characters      
    // if (s.matches("[a-zA-Z]+[a-zA-Z0-9!@#$%^&*(){7,}]*")){                    or symbols in any particular order.

         isValid = "Valid Password";
         System.out.print (isValid);
      
      }
      else{
         isValid = "Invalid Password! ";
        
         System.out.print (isValid);
      
      }
      return isValid;
   
   
   }
}