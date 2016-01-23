//author: Mike Jones
// This program will return random numbers from an array








public class randomChoice{

   public static void main (String[]args){
      int[]array={1,2,3,4,5};
      
      int[]array1={2,4,6,8,10};//create my arrays
      
      int[]array2={3,6,9,12,15};
      
      int[]array3={4,8,12,16,20};
      
      int[]array4={5,10,15,20,30};
      
      
      int result = randomChoice(array);
      
      int result1 = randomChoice(array1);
      
      int result2 = randomChoice(array2);//find results of the random numbers
      
      int result3 = randomChoice(array3);
      
      int result4 = randomChoice(array4);
           
      System.out.println (result);
      
      System.out.println (result1);
      
      System.out.println (result2);
      
      System.out.println (result3);
      
      System.out.println (result4);
   }
   
   
   


   public static int randomChoice(int[]number){
   
      int x = (int) (Math.random() *number.length );//method to return random numbers
      return number[x];
   
   }

}