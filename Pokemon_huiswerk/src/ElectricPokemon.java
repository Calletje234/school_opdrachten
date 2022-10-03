import java.util.Objects;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = List.of("tackle",
            "thunderPunch",
            "electroBall",
            "thunder",
            "voltTackle"
    );
    public ElectricPokemon(String name, String food, String sound) {
        super(name, food, sound, "Electric");
    }

    @Override
    public void takeDamage(int damageTake, String attackerType){
        int newDamage = 0;
        if (Objects.equals(attackerType, "Water")) {
            newDamage = damageTake * 2;
        } else {
            newDamage = damageTake;
        }
        this.setLowerHealth(newDamage);
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
