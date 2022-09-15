import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String errorCommand = "Command Unknown";
        Integer[] numericValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] alphabaticValues = {"Nul", "Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen"};

        Translator translate = new Translator(numericValues, alphabaticValues);
        boolean run = true;
        while (run) {
            System.out.println("Press 'q' to stop the program\nPress 'e' To enter number");
            String userChoice = scanner.nextLine();
            if (Objects.equals(userChoice, "x")) {
                run = false;
            } else if(Objects.equals(userChoice, "e")) {
                System.out.println("Please give a number between " + numericValues[0] + " and " + numericValues[numericValues.length-1]);
                int numberInput = scanner.nextInt();
                translate.TranslateNumber(numberInput);
            } else {
                System.out.println(errorCommand);
            }
        }
    }
}
