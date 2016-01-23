    import java.util.Scanner;  
      
    public class AreaHexagon {  
      
        public static void main(String[] args) {  
            
            Scanner input = new Scanner (System.in);  
            
            System.out.println("Enter the side of a hexagon :");  
            
             double side = input.nextDouble();
            
             double A = (( 3 * Math.sqrt(3) * Math.pow(side , 2))) / 2;
                
             System.out.println("The area is " + A);  
    }
    }