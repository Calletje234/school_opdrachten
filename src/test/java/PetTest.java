import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetTest {
    private static final String petName = "Banjer";
    private static final int petAge = 3;
    private static final String petSpecies = "Dog";
    private static final String newOwnerName = "Yvonne";
    private static final String newOwnerMiddleName = "van";
    private static final String newOwnerLastName = "Beek";
    private static final int newOwnerAge = 53;
    private static final String newOwnerSex = "Female";
    private Person testOwner;
    private Pet testPet;

    @BeforeEach
    public void createNewOwner() {
        this.testPet = new Pet("Saartje", 1, "Cat");
        this.testOwner = new Person(newOwnerName, newOwnerMiddleName, newOwnerLastName, newOwnerAge, newOwnerSex);
    }

    @Test
    public void getName() {
        testPet.setName(petName);
        String newName = testPet.getName();
        assertEquals(petName, newName);
    }

    @Test
    public void getAge() {
        testPet.setAge(petAge);
        int newAge = testPet.getAge();
        assertEquals(petAge, newAge);
    }

    @Test
    public void getSpecies() {
        testPet.setSpecies(petSpecies);
        String newSpecies = testPet.getSpecies();
        assertEquals(petSpecies, newSpecies);
    }

    @Test
    public void getOwner() {
        testPet.setOwner(testOwner);
        Person newOwner = testPet.getOwner();
        String ownerName = newOwner.getName();
        int ownerAge = newOwner.getAge();
        assertEquals(newOwnerName, ownerName);
        assertEquals(newOwnerAge, ownerAge);
    }
}