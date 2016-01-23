public class Wizard extends Character{//child class of the parent class Character

   public Wizard (String name,String race){//constructor
      
      super(name, race);//inherited from the parent class
   }
  /*assignes the phrase associated with character*/
  
   public void fireBall(){// method body
      
      System.out.println("Burn Baby, Burn! " );//output
        
   }
   /**
		converts all the method calls and characteristics to a string for output   		
      @param String:
	   */

   @Override
   
   public String toString(){//start of method
      
      getCharacterClass();//call method
      
      intelligence = intelligence +2;//add two to the specific characteristic
      
      addToInventory("Spell Book");//call the method with item parameters
      
      fireBall();//call method
      
      return super. name + " the " + super.race + " has a strength of " + strength + "\n" + "His dexterity is " + //output
                    
                    dexterity +"\n" + "His constitution is " + constitution + "\n" + "His wisdom is " + wisdom + 
                    
                    "\n" + "His charisma is " + charisma + '\n'+ "His intelligence is "+ intelligence + '\n'+
                   
                    "Current inventory is "+ inventory ; 
   }
   
       /**
		Adds a String item to the current inventory
		@param item : an item is added to the characters inventory
	   */

   public void addToInventory (String item){//method cstart
      
      super.inventory.add(item);
   }
      /**
		gets the class of the character
		returns the name of the character
	   */


   public String getCharacterClass(){//method body
      
      return "Wizard";//unique to this class
   }
   public static void main(String[]args){//main method for testing
     
      Wizard charguy = new Wizard("Wizard","Caucasian");//new object
     
      System.out.println(charguy);//output
   
   }//end of main method
  
}//end of class

