public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person("Calvin", "van", "Beek", 26, "Male");
        Person testPersonFather = new Person("Henk", "van", "Beek", 70, "Male");
        testPerson.setFather(testPersonFather);
    }
}
