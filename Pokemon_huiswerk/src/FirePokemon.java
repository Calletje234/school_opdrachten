import java.util.Objects;

public abstract class FirePokemon extends Pokemon {
    private final String type = "Fire";

    public FirePokemon(String name, String food, String sound) {
        super(name, food, sound);
    }

    @Override
    public void takeDamage(int damageTaken, String attackerType) {
        int newDamage = 0;
        if (Objects.equals(attackerType, "Water")) {
            newDamage = damageTaken * 2;
        } else {
            newDamage = damageTaken;
        }
        this.setLowerHealth(newDamage);
    }

    public int fireBreath(){
        return 5;
    }
}


