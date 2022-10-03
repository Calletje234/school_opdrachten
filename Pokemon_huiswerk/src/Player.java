import java.util.List;

public class Player {
    private String name;
    private List<Pokemon> pokemon;

    public Player(String name) {
        addStandardPokemon();
    }

    private void addStandardPokemon() {
        Pokemon CharLizard = new FirePokemon("CharLizard", "apple", "ChaarLizard");
        Pokemon Pikachu = new ElectricPokemon("Pikachu", "raspberry", "Pika pika");
        Pokemon Bulbasaur = new GrassPokemon("Bulbasaur", "leafes", "Bulbasaur");
        Pokemon Blastoise = new Waterpokemon("Blastoise", "fish", "Blastoise");
    }
}
