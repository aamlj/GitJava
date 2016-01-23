//Author: Mike Jones

// Program Description: gives the square root of 300 using Heron's formula



public class HeronsFormula{

   public static void main(String[] args){

int x = 300;

double epsilon = Math.abs( 1 );

double step = 0.1;

double guess = 0.0;

while ( guess <= x){
   
   if ( Math.abs( (guess*guess) -x) < epsilon){
 
   break;
   
  } else{ 
      guess += step;
      }
}



  
 
    if ( Math.abs( (guess*guess) - x) >= epsilon){

      System.out.print ("failed");

  }else{
     
       System.out.print ("Sucess" + guess);
       
       }
}
}


