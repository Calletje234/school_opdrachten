import java.util.Scanner;

public class User {
    private String name;
    private short age;
    private double weight;
    private double length;

    Scanner scanner = new Scanner(System.in);
    MessagePrinter printer = new MessagePrinter();

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(short newAge) {
        this.age = newAge;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public double getWeight() {
        return  weight;
    }

    public double getLength() {
        return length;
    }

    public void createUser(){
        printer.printUserMessage();
        setName(scanner.nextLine());
        setAge(scanner.nextShort());
        double user_weight = scanner.nextDouble();
        double user_length = scanner.nextDouble();
        setWeight(user_weight);
        setLength(user_length);
    }
}
