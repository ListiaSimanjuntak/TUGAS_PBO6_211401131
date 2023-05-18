
interface Character {
    void display();
    void attack();
    void defend();
}


abstract class AbstractCharacter implements Character {
    protected String name;
    protected int health;

    public AbstractCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    
    public void display() {
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
    }

    
    public void attack() {
        System.out.println(name + " is attacking!!!");
    }

    
    public void defend() {
        System.out.println(name + " is defending!!!");
    }
}


class InnerGameCharacter {
    private AbstractCharacter character;

    public InnerGameCharacter(String name, int health) {
        character = new CharacterImpl(name, health);
    }

    public void execute() {
        character.display();
        character.attack();
        character.defend();
    }

  
    private class CharacterImpl extends AbstractCharacter {
        public CharacterImpl(String name, int health) {
            super(name, health);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InnerGameCharacter innerGameCharacter = new InnerGameCharacter("Player 1", 100);
        innerGameCharacter.execute();
    }
}
