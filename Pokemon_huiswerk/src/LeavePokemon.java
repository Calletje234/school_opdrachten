public abstract class LeavePokemon extends Pokemon {
    public LeavePokemon(String name, String food, String sound) {
        super(name, food, sound);
    }

    @Override
    public void takeDamage(int damageTake, String attackerType) {}

    @Override
    public void tackle(){}
}
