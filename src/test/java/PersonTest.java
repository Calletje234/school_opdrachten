import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private static final String testPersonName = "Calvin";
    private static final int testPersonAge = 26;
    private static final String testPersonSex = "Male";
    private static final String familyMiddleName = "van";
    private static final String familyLastName = "Beek";
    private static final String fatherName = "Henk";
    private static final String motherName = "Yvonne";
    private Person testPerson;

    @BeforeEach
    public void testSetup() {
        this.testPerson = new Person(testPersonName, familyMiddleName, familyLastName, testPersonAge, testPersonSex);
    }

    @Test
    public void getMother() {
        int motherAge = 53;
        Person newMother = new Person(motherName, familyMiddleName, familyLastName, motherAge, "Female");
        testPerson.setMother(newMother);
        Person addedMother = testPerson.getMother();
        assertEquals(motherName, addedMother.getName());
        assertEquals(familyMiddleName, addedMother.getMiddleName());
        assertEquals(familyLastName, addedMother.getLastName());
        assertEquals(motherAge, addedMother.getAge());
    }

    @Test
    public void getFather() {
        int fatherAge = 70;
        Person newFather = new Person(fatherName, familyMiddleName, familyLastName, fatherAge, "Male");
        testPerson.setFather(newFather);
        Person addedFather = testPerson.getFather();
        assertEquals(fatherName, addedFather.getName());
        assertEquals(familyMiddleName, addedFather.getMiddleName());
        assertEquals(familyLastName, addedFather.getLastName());
        assertEquals(fatherAge, addedFather.getAge());
    }

    @Test
    public void getPets() {
        String petName = "Saartje";
        int petAge = 1;
        String petSpecies = "Cat";
        testPerson.addPet(petName, petAge, petSpecies);
        List<Pet> ownerPets = testPerson.getPets();
        int listLength = ownerPets.size();
        assertNotEquals(0, listLength);
    }

    @Test
    public void getChildren() {
        String childName = "Ronnie";
        int childAge = 16;
        Person child = new Person(childName, familyMiddleName, familyLastName, childAge, "Male");
        testPerson.addChild(child);
        List<Person> addedChildren = testPerson.getChildren();
        for(Person addedChild : addedChildren){
            assertEquals(childName, addedChild.getName());
            assertEquals(childAge, addedChild.getAge());
        }
    }

    @Test
    public void getGrandChildren() {
        String grandChildName = "Floor";
        Person child = new Person("Ronnie", familyMiddleName, familyLastName, 16, "Male");
        Person grandChild = new Person(grandChildName, familyMiddleName, familyLastName, 1, "Female");
        child.addChild(grandChild);
        testPerson.getGrandChildren();
    }

    @Test
    public void getName() {
        testPerson.setName("Emma");
        assertEquals("Emma", testPerson.getName());
    }

    @Test
    public void getMiddleName() {
        testPerson.setMiddleName("");
        assertEquals("", testPerson.getMiddleName());
    }

    @Test
    public void getLastName() {
        testPerson.setLastName("Boxtart");
        assertEquals("Boxtart", testPerson.getLastName());
    }

    @Test
    public void getSex() {
        assertEquals(testPersonSex, testPerson.getSex());
    }

    @Test
    public void getAge() {
        assertEquals(testPersonAge, testPerson.getAge());
    }

    @Test
    public void getParents() {
        int motherAge = 53;
        int fatherAge = 70;
        Person newMother = new Person(motherName, familyMiddleName, familyLastName, motherAge, "Female");
        Person newFather = new Person(fatherName, familyMiddleName, familyLastName, fatherAge, "Male");
        testPerson.setFather(newFather);
        testPerson.setMother(newMother);
        testPerson.setParents();
        List<Person> testPersonsParents = testPerson.getParents();
        int listLength = testPersonsParents.size();
        assertNotEquals(0, listLength);
    }

    @Test
    public void getSiblings() {
        String siblingName = "Corne";
        String siblingMiddleName = "";
        String siblingLastName = "Weidenaar";
        int siblingAge = 24;
        String siblingSex = "Male";
        testPerson.addSibling(siblingName, siblingMiddleName, siblingLastName, siblingAge, siblingSex);
        List<Person> testPersonsSiblings = testPerson.getSiblings();
        int listLength = testPersonsSiblings.size();
        assertNotEquals(0, listLength);
    }
}