import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Player {
    private final String name;
    private int pokemonAmount;
    private List<Pokemon> ownedPokemons;

    public Player(String name) {
        this.name = name;
        addStandardPokemon();
    }

    private void addStandardPokemon() {
        Pokemon CharLizard = new FirePokemon("CharLizard", "apple", "ChaarLizard");
        Pokemon Pikachu = new ElectricPokemon("Pikachu", "raspberry", "Pika pika");
        Pokemon Bulbasaur = new GrassPokemon("Bulbasaur", "leafes", "Bulbasaur");
        Pokemon Blastoise = new Waterpokemon("Blastoise", "fish", "Blastoise");
        ownedPokemons.add(CharLizard);
        ownedPokemons.add(Pikachu);
        ownedPokemons.add(Bulbasaur);
        ownedPokemons.add(Blastoise);
        pokemonAmount += 4;
    }

    public void addPokemon(String type, String name, String foodType, String sound) {
        switch(type.toLowerCase(Locale.ROOT)) {
            case "fire":
                Pokemon firePokemon = new FirePokemon(name, foodType, sound);
                ownedPokemons.add(firePokemon);
                pokemonAmount += 1;
            case "water":
                Pokemon waterPokemon = new Waterpokemon(name, foodType, sound);
                ownedPokemons.add(waterPokemon);
                pokemonAmount += 1;
            case "grass":
                Pokemon grassPokemon = new GrassPokemon(name, foodType, sound);
                ownedPokemons.add(grassPokemon);
                pokemonAmount += 1;
            case "electric":
                Pokemon electricPokemon = new ElectricPokemon(name, foodType, sound);
                ownedPokemons.add(electricPokemon);
                pokemonAmount += 1;
        }
    }

    public Pokemon removePokemon(String nameForRemoving) {
        for(Pokemon pokemon : ownedPokemons) {
            if(Objects.equals(pokemon.getName(), nameForRemoving)) {
                int indexInList = ownedPokemons.indexOf(pokemon);
                return ownedPokemons.remove(indexInList);
            }
        }
        return null;
    }

    public List<Pokemon> getPokemon() {
        return ownedPokemons;
    }
}
