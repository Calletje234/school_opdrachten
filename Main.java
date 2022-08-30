import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.println("Please type in youre name:");
        String name = scanner.nextLine();
        System.out.printf("Youre name is: %s%n", name);
    }
}
