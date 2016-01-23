import java.util.Scanner;  


public class ShowCurrentTime {
 
   public static void main (String[] args) {
  
  
   Scanner input = new Scanner (System.in);
  
  
      long totalMilliseconds = System.currentTimeMillis();
     
      long totalSeconds = totalMilliseconds / 1000;
     
      long currentSecond = totalSeconds % 60;
     
      long totalMinutes = totalSeconds / 60;
     
      long currentMinute = totalMinutes % 60;
     
      long totalHours = totalMinutes / 60;
     
      long currentHour = totalHours % 24;
     
      //prompt user to enter offset to GMT
      System.out.print("Enter the time zone offset to GMT: ");
     
      //plug in input to varible
      long offset = input.nextLong();
    
      //calculate offset to GMT
      currentHour = (currentHour + offset + 24) % 24;
     
      //Display the results
      System.out.println("The current time is "+ currentHour +  ":" +
                          currentMinute + ":" + currentSecond + " GMT");
                         
                          }
                          }
