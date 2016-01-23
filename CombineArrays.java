//Author: Mike Jones
// This program will take two arrays and combine them into one array

public class CombineArrays {

   public static void main(String[] args) {
      
      int a[]={1,2};
      
      int b[]={3,4};
   	
      int c[]=combineArrays(a,b);// call my method
   	
      for (int e:c)//new trick to create a for loop to create e for output
         System. out.print(e);
   }     
		
	
	
	
	/*the combineArrays method will take the lenth of a and add it to the lenth of b*/
   public static int[] combineArrays(int a[],int b []){
   	
      int x[] = new int [a.length  + b.length];
      
      for (int i=0; i < a.length; i++)//loop to find length of a or (x)
      {
         x[i] = a[i];
      }
   	
            for (int i=a.length; i < x.length; i++){// loop to find length of b - length of a so it will add just b
      	
         x[i]= b[i - a.length];
      }
      return x;
   }
	
}
