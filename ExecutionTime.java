//Author: Mike Jones

//this program will show the difference in milliseconds between a linear search and a binary search



public class ExecutionTime{

   public static void main (String[]args){
   
      {
         int[] myList = new int[100000]; //Declare my array
         
         
         int key = 55555; //my random number in list
         
         for (int i = 0; i < myList.length; i++) 
         {
            myList[i] = (int)(Math.random()* myList.length); //Generate random number Array
            
         }       
            
         
         long startTime = System.currentTimeMillis();
        
         System.out.println( linearSearch(myList, key));
         
         long endTime = System.currentTimeMillis();
        
        
         long executionTime = endTime - startTime;
        
         System.out.println("The execution time for linear search is:" + executionTime);
         
         
           
         java.util.Arrays.sort(myList);//java function to sort arrays 
               
         startTime = System.currentTimeMillis();
         
         System.out.println( binarySearch(myList, key));
         
         endTime = System.currentTimeMillis();
         
         
         executionTime = endTime - startTime;
         
         System.out.println("The execution time for binary search is: " + executionTime);
      }
   }
   public static int linearSearch(int[] list, int key){//method from book 
            
      for (int i = 0; i < list.length; i++){
               
         if (key == list[i]) //refers back to int key in Main Method
                  
            return i;
      }
      return -1;
   }
      
   public static int binarySearch(int[] list, int key){//method from book
      
      int low = 0;
      
      int high = list.length - 1; //refers back to int key in Main Method
         
      while (high >= low)
      {
         int mid = (low + high) /2; //runs through the algorythum high or low and divides by half results each pass
         
         if (key < list[mid])
           
            high = mid -1;
         
         else if (key == list[mid])
           
            return mid;
         
         else
            
            low = mid +1;
      }
      return -low -1;
   }
}
   
