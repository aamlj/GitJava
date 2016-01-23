//author Mike Jones
// program to take the middle index of the two arrays and display in a new array

public class MiddleWay {

   public static void main(String[] args) {
   	
      int a []={1,2,3}; int b []={4,5,6};
      int c[]=middleWay(a,b);              //call method to assign values and print output
      System.out.println ("{" + c[0] + "," + c[1]+"}");
   	
      a = new int[]{7,7,7}; b =new int[]{3,8,0};
      c= middleWay(a,b);                   //call method to assign values and print output
      System.out.println ("{" + c[0] + "," + c[1]+"}");
   	
      a = new int[]{5,2,9}; b = new int[]{1,4,5};	
      c= middleWay(a,b);                   //call method to assign values and print output 
      System.out.println("{" + c[0] + "," + c[1] + "}");
   
   
   }
	/* created middleWay method to pull out two middle indexes*/
   public static int[] middleWay(int a [], int b []) {
   	 
      int x [] = new int[] {a[1], b[1]};
   
      return x;	
   }	
       
}