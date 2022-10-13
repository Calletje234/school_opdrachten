import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = List.of("tackle",
            "fireLash",
            "flameThrower",
            "pyroBall",
            "inferno"
    );

    public FirePokemon(String name, String food, String sound) {
        super(name, food, sound, "Fire");
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

    public List<String> getAttacks() {
        return attacks;
    }
}


