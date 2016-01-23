// Author: Mike Jones

// Program Description:  a program that prompts the user to enter the number of students 
//and each student's name and score. Then, display Student with the largest score 
//(with their name).

 

import javax.swing.JOptionPane;

import java.util.Scanner;

public class LargestScore

{
   public static void main(String[] args)
   {
     
      Scanner input = new Scanner(System.in);


      int highGrade = 0;

      String highScoreStudentName = "";

      int numStudents = 0;

 

      //Keep prompting for the number of students until the user enters a number >= 1.

      while (numStudents <= 0)

      {

         numStudents = Integer.parseInt(JOptionPane.showInputDialog(null, "How many students?"));

 

         if (numStudents <= 0)

         {

            System.out.println( "The number of students must be greater than or equal to 1.");

         }

      }

    
      int loopCounter = 1;

 

      //For each student ask for the student’s grade and name.

      //Save the highest student grade and score as the student names and scores are entered

      //by comparing against the current highest score (highScore) entered thus far.

      while (loopCounter <= numStudents)

      {

         System.out.print ("Enter student #" + loopCounter + " grade? ");
  
         int studentGrade = input.nextInt();
  
         System.out.println("Enter student #" + loopCounter + " name?");
 
         String studentName = input.next();

 

         if (studentGrade > highGrade)

         {

            highGrade = studentGrade;

            highScoreStudentName = studentName;

         }

        

         loopCounter++;

      }

 

      System.out.println("The student with the highest score was " + highScoreStudentName + " with a score of " + highGrade + ".");
   }
}

 




