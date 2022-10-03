import java.util.List;
import java.util.Objects;

public class Waterpokemon extends Pokemon {
    private final List<String> attacks = List.of("tackle",
            "surf",
            "hydroPump",
            "hydroCanon",
            "rainDance"
    );
    public Waterpokemon(String name, String food, String sound) {
        super(name, food, sound, "Water");
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

    public List<String> getAttacks() {
        return attacks;
    }
}
