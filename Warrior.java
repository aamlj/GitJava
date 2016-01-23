public class Warrior extends Character{//child class of parent class Character


   public Warrior (String name,String race){//constructor
      
      super(name, race);//uses Character class
   }
  
  /*assignes the phrase associated with character*/
  
   public void BattleCry(){//method declaration
      
      System.out.println("Hugggghhhhhh" );//unique to this character
        
   }
     /**
		converts all the method calls and characteristics to a string for output   		
      @param String:
	   */
   
   @Override//must use this to override default toString method
   
   public String toString(){//Method declaration
      
      getCharacterClass();//call method
      
      strength = strength +2;//add two to characteristic
      
      addToInventory("Plate Mail");//adds item to inventory
      
      BattleCry();//call method
      
      return super. name + " the " + super.race + " has a strength of " + strength + "\n" + "His dexterity is " + //output
                    
                    dexterity +"\n" + "His constitution is " + constitution + "\n" + "His wisdom is " + wisdom + 
                    
                    "\n" + "His charisma is " + charisma + '\n'+ "His intelligence is "+ intelligence + '\n'+
                    
                    "Current inventory is "+ inventory ; 
   }
   
      /**
		Adds a String item to the current inventory
		@param item : an item is added to the characters inventory
	   */

   public void addToInventory (String item){//stsrt of method
      
      super.inventory.add(item);//from the Character class
   
   }//end method
      /**
		gets the class of the character
		returns the name of the character
	   */

   public String getCharacterClass(){//start of the method
      
      return "Warrior";//unique to this class
   }
   public static void main(String[]args){//tester for the class
      
      Warrior charguy = new Warrior("Warrior","Indian");//create new object
      
      System.out.println(charguy);//output results
   
   }

}

