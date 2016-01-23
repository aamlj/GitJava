public class Cleric extends Character{//child class of parent Character

   public Cleric (String name,String race){//constructor
      
      super(name, race);
   }
   /*assignes the phrase associated with character*/

   public void heal(){//method starts
      
      System.out.println("Ahhhhhhhhhhh! " );
        
   }
   /**
		converts all the method calls and characteristics to a string for output   		
      @param String:
	   */


   @Override
   public String toString(){//start of method
      
      getCharacterClass();//call method
      
      charisma = charisma +2;//add two to the characteristic
      
      addToInventory("Holy Relic");//call method
      
      heal();//call method
      
      return super. name + " the " + super.race + " has a strength of " + strength + "\n" + "His dexterity is " + //output
                    
                    dexterity +"\n" + "His constitution is " + constitution + "\n" + "His wisdom is " + wisdom + 
                   
                    "\n" + "His charisma is " + charisma + '\n'+ "His intelligence is "+ intelligence + '\n'+
                    
                    "Current inventory is "+ inventory ; 
   }
     /**
		Adds a String item to the current inventory
		@param item : an item is added to the characters inventory
	   */

   public void addToInventory (String item){//start method
     
      super.inventory.add(item);
   }
       /**
		gets the class of the character
		returns the name of the character
	   */

   public String getCharacterClass(){//start method
      
      return "Cleric";
   }
   public static void main(String[]args){//main method for testing
      
      Cleric charguy = new Cleric("Cleric","Vietnamiese");//new object
      
      System.out.println(charguy);//output
   
   }//end of main method
  
}//end of class

