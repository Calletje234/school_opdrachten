import lombok.Getter;
import lombok.Setter;

public class Pet {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private String species;
    @Getter
    private Person owner;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
