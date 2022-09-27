import java.util.Objects;

public abstract class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, String food, String sound) {
        super(name, food, sound);
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
}
