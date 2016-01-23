public class Spell {
    private String incantation;
    private String name;

    public Spell(String name, String incantation){
        this.name = name;
        this.incantation = incantation;
    }

    public String toString(){
        return this.name + " - " + this.incantation + "\n" + this.getDescription();
    }
                     
    public String getDescription(){
        return "No description";
    }

    public void perform(){
        System.out.println(this.incantation);
    }

    public static void main(String[] args) {
        Spell spell = new Aero();
        spell.perform();
        studySpell(spell);
        studySpell(new Drain());
    }

    public static void studySpell(Spell spell) {
        System.out.println(spell);
    }
}

class Aero extends Spell{
    Aero(){
        super("Aero", "Quetzacoatl Aerora");
    }
}

class Drain extends Spell{
    public String description;
    Drain(){
        super("Drain", "Diabolos Drainga");
        description = "Drains life from the victim and is absorbed into the caster";
    }

    public String getDescription() {
        return this.description;
    }
}  