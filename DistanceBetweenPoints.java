

    import java.util.Scanner; //Scanner is in the package. 
      
      
      
     
    public class DistanceBetweenPoints  {
  
    public static void main(String[] args)  {
          
     //create scanner object         
     Scanner scan = new Scanner (System.in);  
            
      //prompt user to enter four cordinates 
    
     System.out.println("Enter the x1 coordinate : ");  
         
         double x1 = scan.nextDouble();  
              
     System.out.println("Enter the y1 coordinate : ");  
         
          double  y1 = scan.nextDouble();  
              
      System.out.println("Enter the x2 coordinate : ");  
          
          double  x2 = scan.nextDouble();  
              
       System.out.println("Enter the y2 coordinate : ");  
         
          double  y2 = scan.nextDouble();  
          
          //compute formula for distance    
          double distance = Math.pow(((x2- x1)*( x2- x1) + ( y2- y1)*( y2- y1)), 0.5);   
         
         //display answer  
        System.out.println("The distance between the two points is " + distance + " .");  
              
        }  
          

}
