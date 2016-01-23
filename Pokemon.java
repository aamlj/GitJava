import java.util.Date;
public class Pokemon {
	// Class Variables
	private String name;
	private int level;
	private int HP;
	private String type;
	private int attack;
	private int defense;
	private int speed;
	private String[] attacksKnown;
	private Date created;
	
	// Constructor
	public Pokemon(String name, int level, int HP, String type, 
		int attack, int defense, int speed, String[] attacksKnown) {
		this.name = name;
		this.level = level;
		this.HP = HP;
		this.type = type;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.attacksKnown = attacksKnown;
		this.created = new Date();
	}
	
	// Class Methods
	//	Getters/Setters
	//		name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//		level
	public int getLevel() {
		return this.level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	//		HP
	public int getHP() {
		return this.HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	//		type
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//		attack
	public int getAttack() {
		return this.attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	//		defense 
	public int getDefense() {
		return this.defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	//		speed
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// 		attacksKnown
	public String[] getAttacksKnown() {
		return this.attacksKnown;
	}
	public void setAttacksKnown(String[] attacksKnown) {
		this.attacksKnown = attacksKnown;
	}
	// 		created
	public Date getCreated() {
		return this.created;
	}
	
	// Main Method
	public static void main(String[] args) {
        String[] movesPika = {"Growl", "Thundershock"};
        Pokemon pikachu = new Pokemon("Pikachu", 1, 12, "electric", 120, 11, 13, movesPika);

        System.out.println("Pikachu' is a(n) " + pikachu.getType() + "-type Pokemon");
        System.out.println("Pikachu's Moveset is: ");
        //pikachu.listMoves();
		pikachu.addMove("Thunder Smash");
		pikachu.addMove("Tickle Bomb");
		pikachu.addMove("Possum");
		pikachu.addMove("Lighting Flame");
		pikachu.listMoves();
		pikachu.removeMove("Possum");
		System.out.println("=======");
		pikachu.listMoves();

		Pokemon bulbasaur = new Pokemon("Bulbasaur", 3, 16, "grass", 16, 16, 16, new String[]{"Tackle", "Growl"});
		
		int d = pikachu.damage(bulbasaur.getDefense());
		System.out.printf("Pikachu does %d damage to Bulbasaur", d);
	}
	
	// listMoves
	public void listMoves() {
		for(int i = 0;i < attacksKnown.length; i++){
			System.out.println(attacksKnown[i]);
		}
	}
	
	/**
		Adds a String move to the current attacksKnown
		@param move : a String that is one of the valid Pokemon movesBulb
	*/
	public void addMove (String move) {
		// Create a temporary new array
		String[] newMoves = new String[this.attacksKnown.length+1];
		// Traverse attacksKnown and copy elements in newMoves
		for(int i = 0;i < this.attacksKnown.length; i++){
			newMoves[i] = this.attacksKnown[i];
		}
		// Add move to end of newMoves
		newMoves[newMoves.length-1] = move;
		//Set attacksKnown to newMoves
		this.attacksKnown = newMoves;
	}
	
	/**
		Removes a String move to the current attacksKnown
		@param move : a String that is one of the valid Pokemon movesBulb
	*/
	public void removeMove (String move) {
		// Create a temporary new array
		String[] newMoves = new String[this.attacksKnown.length-1];
		int index=0;
		// Traverse attacksKnown and copy elements in newMoves
		for(int i = 0;i < this.attacksKnown.length; i++){
			// if move does not equal this.attacksKnown[i]
			// then, copy the move to newMoves
			if( move.equals(this.attacksKnown[i]) == false ){
				newMoves[index] = this.attacksKnown[i];
				index++;
			}
		}
		//Set attacksKnown to newMoves
		this.attacksKnown = newMoves;
	}
	
	// damage method
	public int damage(int def){
		double first = (2.0 * this.level + 10) / 250;
		double second = (this.attack / def);
		double left = (first * second * 50 + 2);
		double mod = (Math.random() * 0.15) + 0.85;
		int d = (int)(left*mod);
		//System.out.printf("%f %f %f %f %d\n", first, second, left, mod, d);
		return d;
	}
}