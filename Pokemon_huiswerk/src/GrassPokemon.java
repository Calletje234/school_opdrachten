import java.util.List;


public class GrassPokemon extends Pokemon {
    private final List<String> attacks = List.of("tackle",
            "leafStorm",
            "solarBeam",
            "leechSeed",
            "leaveBlade"
    );
    public GrassPokemon(String name, String food, String sound) {
        super(name, food, sound, "Grass");
    }

    @Override
    public void takeDamage(int damageTake, String attackerType) {
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
