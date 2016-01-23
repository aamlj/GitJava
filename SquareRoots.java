//author: Mike Jones
// program description:  Finds the square root of even numbers 1-20 and displays in a table

public class SquareRoots
{
    public static void main(String[] args)
    {
       System.out.println("   Square Root Table");//create header for table
      
       System.out.print("-----------------------");
 
       for ( int x = 0; x <= 20; x+=2){ //conditional stastement

       System.out.printf("\n %d\t\t%.4f", x,(Math.sqrt(x)));//display results using the Math.sqrt method

}
}
} 