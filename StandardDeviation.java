//Author: mike jones
// Program will take 10 random numbers make them into an array and find the standard deviation.

public class StandardDeviation{

   public static void main (String[]args){
   
      int[] arrayOfNumbers;
   
      double stdDeviation = 0.0;
   
      arrayOfNumbers = new int[10];//create the array
   
      for (int i = 0; i < 10; i++) {
      
         arrayOfNumbers[i] = (int)(Math.random() * 100);//creates random numbers
      
         System.out.printf("%d ", arrayOfNumbers[i]);//print the ten numbers selected
      
      }
   
      stdDeviation = standardDeviation(arrayOfNumbers);//call standardDeviation method
   
      System.out.printf("\nThe standard deviation is %.2f", stdDeviation);//output standard deviation
   
   }


  //method takes the returned value and finds the square root of the average 
   //from sumOfDifferenceFromMeanSquared method to find standardDeviation//
   public static double standardDeviation(int[] arrayOfNumbersPassed) {
   
      double averageOfNumbers = 0.0;
   
      double sumOfDiffFromMeanSquared = 0.0;
   
      double retVal = 0.0;
   
      averageOfNumbers = getAverage(arrayOfNumbersPassed);
   
      sumOfDiffFromMeanSquared = sumOfDifferenceFromMeanSquared(averageOfNumbers, arrayOfNumbersPassed);
   
      retVal = Math.sqrt( sumOfDiffFromMeanSquared / arrayOfNumbersPassed.length);
   
      return retVal;
   
   }


   /*method that finds the average of our array*/
   public static double getAverage(int[] arrayOfNumbersPassed) {
   
      double retVal = 0.0;
   
      int sumOfValues = 0;
   
      for (int i = 0; i < arrayOfNumbersPassed.length; i++) {
      
         sumOfValues += arrayOfNumbersPassed[i];
      
      }
   
      retVal = (double)(sumOfValues / arrayOfNumbersPassed.length);//changes array to a double
   
      return retVal;
   
   }


   /*method that finds the difference of each element from the average and squares it*/
   public static double sumOfDifferenceFromMeanSquared(double meanValue, int[] arrayOfNumbersPassed) {
   
      double retVal = 0.0;
   
      for (int i = 0; i < arrayOfNumbersPassed.length; i++) {
      
         retVal += Math.pow((double) (arrayOfNumbersPassed[i] - meanValue), 2);
      
      }
   
      return retVal;
   
   }



}




