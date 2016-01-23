/**
   @author  Mike Jones
   @date    02/19/2015
   @class   CSC 251 N01, Spring 2015
*/



public class QueueJonesMike{//creates class
    

   string customerJonesMike[] customers;//variable declaration from customerJonesMike class
  
   /** Constructor */

   public QueueJonesMike(){//begin constructor body
      
      customers = new customerJonesMike[0];//create new array
   
   
   }//end of constructor

   /**
        Adds a customer to the array 
        @param customerJonesMike customer 
     */

   public void insert(customerJonesMike customer){//begin method body
     
      customerJonesMike[]tempArray = new customerJonesMike[customers.length +1];//create temporary array with extra index
      
      for(int i = 0; i < this.customers.length; i++){//loop through old data
         
         tempArray[i] = this.customers[i];//move elements from temporary array
      
      }//end for loop
      
      tempArray[this.customers.length] = customer;//put in new customer
      
      customers = tempArray;//rename to the original array
   }
   /**
        removes a customer from the array
        @returns String array 
     */

   public customerJonesMike  remove(){//begin method body
      
      customerJonesMike[]tempArray = new customerJonesMike[customers.length -1]; //create temporary array with one less index
      
      for(int i = 0; i < tempArray.length; i++){//loop through elements
         
         tempArray[i] = this.customers[i+1];//removes customer
      
      }//end for loop
      
      customerJonesMike holder = customers[0];//temporary array
      
      customers = tempArray;//replace the old array
      
      return holder;
  
   }//end of method
   
   
  
   
     
      //main method
   public static void main(String[] args) {
      QueueJonesMike queue = new QueueJonesMike();
      String[] cart = {"bread", "bacon", "lettuce", "tomato"};
      customerJonesMike customer = new customerJonesMike("Adam", cart, 10.00);
      queue.insert(customer);
   
      cart = new String[]{"dough", "tomato sauce", "vegan cheese"};
      customer = new customerJonesMike("Devin", cart, 20.00);
      queue.insert(customer);
   
      customerJonesMike dequeued = queue.remove();
      System.out.println(dequeued.getName()); // Prints Adam
   
      cart = new String[]{"chicken", "rice", "jerk chicken seasonings"};
      customer = new customerJonesMike("Joe", cart, 3000.00);
      queue.insert(customer);
   
      dequeued = queue.remove();
      System.out.println(dequeued.getName()); // Prints Devin
   
      dequeued = queue.remove();
      System.out.println(dequeued.getName()); // Prints Joe*/
   
   }//end of main method      
   
}//end of class

