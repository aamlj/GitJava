public class OneHundredDays {
   public static void main (String[] args){
   //declare varible today
   int today;
   
   //declare varible lenth
   int lenth;
  
   //input today value
   today = 3;
   
   //input lenth value
   lenth = 100;
  
   //formula for computing
    int end = (today + lenth) % 7;
   
   
   // display results
   System.out.println("The day you would return: "  + end);
   }
   }