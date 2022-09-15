import java.util.Scanner;

public class userInput {
    Scanner scanner = new Scanner(System.in);
    private final LoginSystem account;
    private final BankAccount bank;

    public userInput() {
        System.out.println("First you need to create a account");
        System.out.println("First give your user name");
        String name = scanner.nextLine();
        System.out.println("Now please enter a secure password");
        String password = scanner.nextLine();
        this.account = new LoginSystem(name, password);
        this.bank = new BankAccount();
    }

    public void displayExplanation(){
        System.out.println("Please make a choice of one of the following options");
        System.out.println(" Action                     Command");
        System.out.println(" - Login                    li");
        System.out.println(" - Logout                   lo ");
        System.out.println(" - Do a Transaction         t");
        System.out.println(" - Show Withdraws           w");
        System.out.println(" - Show Added Amounts       a");
        System.out.println(" - Display Balance          b");
        System.out.println(" - Change Password          cp");
        System.out.println(" - Change Name              cn");
        System.out.println(" - Quit                     q");
    }

    public boolean getCommand() {
        String command = scanner.nextLine();
        switch (command) {
            case "li":
                System.out.println("Please enter username: ");
                String givenUsername = scanner.nextLine();
                System.out.println("Please provide password: ");
                String givenPassword = scanner.nextLine();
                this.account.login(givenUsername, givenPassword);
                break;
            case "lo":
                this.account.logOut();
                break;
            case "t":
                System.out.println("Please Enter amount for transfer");
                double amount = scanner.nextDouble();
                this.bank.TransAction(amount, this.account);
                break;
            case "w":
                for(double item : this.bank.taken_amount()) {
                    System.out.printf("Withdraw Amount: %s\n", item);
                }
                break;
            case "a":
                for(double item : this.bank.added_amount()) {
                    System.out.printf("Added Amount: %s\n", item);
                }
                break;
            case "b":
                this.bank.DisplayCurrentAmount(this.account);
                break;
            case "cp":
                this.account.changePassword();
                break;
            case "cn":
                this.account.changeName();
                break;
            case "q":
                return false;
        }
        return true;
    }

}
