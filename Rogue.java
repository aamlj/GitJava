public class Rogue extends Character{// child class from parent class Character

   
   public Rogue (String name,String race){//constructor
      
      super(name, race);//from the Character class
   }
   /*assignes the phrase associated with character*/
  
   public void sneak(){//unique to this child class
      
      System.out.println("Stealth Mode! " );//output
        
   }
    /**
		converts all the method calls and characteristics to a string for output   		
      @param String:
	   */

   @Override
   
   public String toString(){//start of the method
      
      getCharacterClass();//call method
      
      dexterity = dexterity +2;//add 2 to the specific characteristic
      
      addToInventory("Lock Pick Set");//adds item to inventory
      
      sneak();//call the sneak method
      
      return super. name + " the " + super.race + " has a strength of " + strength + "\n" + "His dexterity is " + //output
                    
                    dexterity +"\n" + "His constitution is " + constitution + "\n" + "His wisdom is " + wisdom + 
                    
                    "\n" + "His charisma is " + charisma + '\n'+ "His intelligence is "+ intelligence + '\n'+
                    
                    "Current inventory is "+ inventory ; 
   }
    /**
		Adds a String item to the current inventory
		@param item : an item is added to the characters inventory
	   */

   public void addToInventory (String item){
      
      super.inventory.add(item);
   }
      /**
		gets the class of the character
		returns the name of the character
	   */

   public String getCharacterClass(){//begin method
      
      return "Rogue";// unique to this character
   }
   public static void main(String[]args){//tester for class
      
      Rogue charguy = new Rogue("Rogue","Hobbit");//create a new object
      
      System.out.println(charguy);//output
   
   }//end of main method
  
}//end of class

