import java.util.Objects;
import java.util.Scanner;

public class BankAccount(String create_name, String password) {
    Scanner scanner = new Scanner(System.in);
    private double current_amount = 0;
    private double[] transactions;
    private String name = create_name;
    private boolean loginState = false;

    void createAccount() {
        System.out.println("Please enter your name");
        this.name = scanner.nextLine();
        System.out.println("Please enter your password");
        password = scanner.nextLine();
    }

    private void setPassword() {
        System.out.println("Please enter a secure password");
        password = scanner.nextLine();
    }

    public void login() {
        String provided_name = scanner.nextLine();
        String provided_password = scanner.nextLine();
        if (Objects.equals(provided_name, name) && Objects.equals(provided_password, password)){
            loginState = true;
        } else {
            System.out.println("Provided Name and Password is Wrong");
        }
    }

    public void logout() {
        System.out.println("Are you sure you want to logout? (Y/N)");
        String choice = scanner.nextLine();
        if(Objects.equals(choice, "Y")){
            loginState = false;
        }
    }

    public void TransAction(double amount) {
        if (loginState) {
            if (amount < 0) {
                SubtractFromAmount(amount);
            } else {
                AddFromAmount(amount);
            }
        } else{
            System.out.println("You are not logged in");
            System.out.println("Please Login to change password");
        }
    }

    private void SubtractFromAmount(double amount) {
        double start_amount = current_amount;
        current_amount -= amount;
        if (current_amount < -250) {
            System.out.println("Your new Balance is lower then -250 which is forbidden");
            System.out.println("Transaction is being rolled back");
            current_amount = start_amount;
        } else if (current_amount <= 0) {
            System.out.println("Wach out your balance is negative");
            System.out.println("It cant be lower then -250");
        }
    }

    private void AddFromAmount(double amount) {
        current_amount += amount;
        System.out.println("Amount is being added to your Account");
    }

    public void DisplayCurrentAmount() {
        if (loginState) {
            System.out.printf("Balance: %s%n", current_amount);
        } else {
            System.out.println("You are not logged in");
            System.out.println("Please Login to change password");
        }
    }

    public void changePassword() {
        if (loginState) {
            System.out.println("Please enter your old password");
            String provided_password = scanner.nextLine();
            if (Objects.equals(provided_password, password)) {
                System.out.println("Please provide new password");
                password = scanner.nextLine();
            }
        } else{
            System.out.println("You are not logged in");
            System.out.println("Please Login to change password");
        }
    }
}