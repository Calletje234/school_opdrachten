public abstract class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, String food, String sound) {
        super(name, food, sound);
    }

    @Override
    public void takeDamage(int damageTake, String attackerType){}

    @Override
    public void tackle(){}
}
