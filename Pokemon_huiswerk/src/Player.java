import java.util.List;

public class Player {
    private String name;
    private List<Pokemon> pokemon;

    public Player(String name) {
        addStandardPokemon();
    }

    private void addStandardPokemon() {
        Pokemon charLizard = new FirePokemon("CharLizard", "apple", "ChaarLizard");
        Pokemon Pikachu = new ElectricPokemon("Pikachu", "raspberry", "Pika pika");
    }
}
