/**
   @author  Mike Jones
   @date    03/05/2015
   @class   CSC 251 N01, Spring 2015
*/

import java.util.Random;//for the vslues of the characteristics

import java.util.ArrayList;//for the list of the inventory

public class Character {//start of the class 
   
   private Random random;
   
   protected  int strength ;   //declare instance variables
   
   protected  int dexterity ;
   
   protected  int constitution;
   
   protected  int intelligence; 
   
   protected  int wisdom;
   
   protected  int charisma;
   
   protected  String name;
   
   protected String race;
   
   protected ArrayList<String>inventory = new  ArrayList<String>();//set an array list

   public Character(String name, String race){//costructor
      
      this. name = name;
      
      this.race = race;
     
      random = new Random();//random for characteristics 
   
      strength = random.nextInt(9) + 10;
     
      dexterity = random.nextInt(9) + 10;
      
      constitution = random.nextInt(9) + 10;//creates random number between 1 and 9 and adds 10
      
      intelligence = random.nextInt(9) + 10;
      
      wisdom = random.nextInt(9) + 10;
      
      charisma = random.nextInt(9)+ 10; 
   }

   public String getName(){//getter for name
      
      return this.name;
   }
   public String getRace(){//getter for race
      
      return this.race;
   }

   public int getStrength(){//getter for strength
      
      return this.strength;
   }
   public int getDexterity(){//getter for dexterity
      
      return this.dexterity;
   }

   public int getConstitution(){//getter for constitutiom
      
      return this.constitution;
   }

   public int getIntelligence(){//getter for intelligence
      
      return this.intelligence;
   }

   public int getWisdom(){//getter for wisdom
      
      return this.wisdom;
   }

   public int getCharisma(){//getter for charisma
      
      return this.charisma;
   }

   public void setStrength(int strength) {//setter for strength
      
      this.strength = strength;
   }
   public void setDexterity(int dexterity) {//setter for dexterity
      
      this.dexterity = dexterity;
   }
   public void setConstitution(int constitution) {//setter for constitution
      
      this.constitution = constitution;
   }
   public void setIntelligence(int intelligence) {//setter for intelligence
      
      this.intelligence = intelligence;
   }
   public void setWisdom(int wisdom) {//setter for wisdom
      
      this.wisdom = wisdom;
   }
   public void setCharisma(int charisma) {//setter for charisma
      
      this.charisma = charisma;
   }
   /**
		Adds a String item to the current inventory
		@param item : an item is added to the characters inventory
	*/

   public void addToInventory(String item) {//method body
      
      inventory.add(item);
   
   }//end of method
      
      /**
		removes a String item from current inventory
		@param item : an item that is removed 
	   */

   public void removeFromInventory(String item) {//method body
      
      inventory.remove(item);
  
   }//end of method
      /**
		returns the object’s getClass() and variables   		
      */
   
   @Override
   public String toString() {//method body
      
      getCharacterClass();
      
      return name + " the " + race + " has a strength of " + strength + "\n" + "a dexterity of " + dexterity +"\n" + "a constitution of " + 
         
         constitution+"\n" + "a wisdom of " + wisdom +"\n"+"a charisma of "+ charisma  ; 
   
   }//end of method
      
      /**
		gets the name of the character
      returns characters name or NPC if none given	
      */

   public String getCharacterClass() {//method body
      
      return "NPC";
  
   }//end of method
  

//end of class
}

