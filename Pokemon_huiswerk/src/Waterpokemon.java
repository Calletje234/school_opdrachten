import java.util.Objects;

public abstract class Waterpokemon extends Pokemon {
    private String type = "Water";
    public Waterpokemon(String name, String food, String sound) {
        super(name, food, sound);
    }

    @Override
    public void takeDamage(int damageTaken, String attackerType) {
            int newDamage = 0;
            if (Objects.equals(attackerType, "Fire")) {
                newDamage = damageTaken * 2;
            } else {
                newDamage = damageTaken;
            }
            this.setLowerHealth(newDamage);
    }
}
