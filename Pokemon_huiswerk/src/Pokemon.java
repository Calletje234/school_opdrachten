import java.util.Random;


public abstract class Pokemon {
    private int level;
    private int hp;
    private int pp = 100;
    private int defense = 0;
    private final String name;
    private String food;
    private String sound;
    Random rand = new Random();

    public Pokemon(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    //Getters en Setters
    public void setLevel(int level) {
        this.level = level;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public int getLevel() {
        return this.level;
    }

    public int getDefense() {return this.defense;}


    // Pokemon methods.
    public void healPokemon(int healAmount) {
        level += healAmount;
        System.out.printf("%s has healed for %s", name, healAmount);
        displayHP();
    }

    public void addDefense(int defenseAmount) {
        if (getDefense()+defenseAmount > 100) {
            int currentDefence = getDefense();
            int restDefence = 100 - currentDefence;
            this.defense += restDefence;
        } else {
            this.defense += defenseAmount;
            System.out.println("You're defense is now Maxed out\n");
        }
        this.defense += defenseAmount;
        System.out.printf("%s Defense is added\n", defenseAmount);
        System.out.printf("You're total defense is now %s", getDefense());
    }

    public void harden() {
        int randomChoice = rand.nextInt(5);
        switch (randomChoice) {
            case 0:
                addDefense(2);
            case 1:
                addDefense(5);
            case 2:
                addDefense(5);
            case 3:
                addDefense(10);
            case 4:
                int jackPot = rand.nextInt(5);
                if(jackPot == 4) {
                    addDefense(30);
                } else {
                    addDefense(15);
                }
        }
        pp -= 5;
    }

    public int tackle() {
        int randomAttack = rand.nextInt(5);
        if(randomAttack == 5) {
            System.out.println("You missed!");
            pp -= 35;
            return 0;
        } else {
            if (level < 5) {
                pp -= 20;
                return 15;
            } else {
                pp -= 35;
                return 30;
            }
        }
    }

    public void setLowerHealth(int hpLost) {
        level -= hpLost;
        System.out.printf("%s has lost %s amount of HP", name, hpLost);
        displayHP();
    }

    public void displayHP() {
        System.out.printf("%s has %s HP", name, hp);
    }

    public abstract void takeDamage(int damageTake, String attackerType);
}
