import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String middleName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String sex;
    @Getter @Setter
    private int age;
    @Getter
    private Person mother;
    @Getter
    private Person father;
    @Getter
    private final List<Person> parents = new ArrayList<Person>();
    @Getter
    private final List<Person> children = new ArrayList<Person>();
    @Getter
    private final List<Person> siblings = new ArrayList<Person>();
    @Getter
    private final List<Pet> pets = new ArrayList<Pet>();

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void setFather(Person fatherObject) {
        this.father = fatherObject;
    }

    public void setMother(Person motherObject) {
        this.mother = motherObject;
    }

    public void addChild(Person childObject) {
        children.add(childObject);
    }

    public void addPet(String petName, int petAge, String petSpecies) {
        Pet newPet = new Pet(petName, petAge, petSpecies);
        newPet.setOwner(this);
        pets.add(newPet);
    }

    public void setParents() {
        parents.add(mother);
        parents.add(father);
    }

    public void addSibling(String siblingName, String siblingMiddleName, String siblingLastName,
                           int siblingAge, String sexSibling) {
        Person newSibling = new Person(siblingName, siblingMiddleName, siblingLastName, siblingAge, sexSibling);
        siblings.add(newSibling);
    }

    public void getGrandChildren() {
        for(Person child : children) {
            if(Objects.equals(child.getChildren().size(), 0)){
                System.out.printf("%s Doesn't have any GrandChildren", name);
            } else {
                int counter = 0;
                System.out.printf("%s has the following GrandChildren", name);
                for(Person grandChild : child.getChildren()) {
                    System.out.printf("%s. %s", counter, grandChild.getName());
                    counter++;
                }
            }
        }
    }
}
