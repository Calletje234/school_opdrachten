public class BankAccount {

    private double current_amount;

    public BankAccount() {
        this.current_amount = 0;
    }


    public void TransAction(double amount, LoginSystem account) {
        if (account.loginState) {
            if (amount < 0) {
                SubtractFromAmount(amount);
            } else {
                AddFromAmount(amount);
            }
        } else {
            System.out.println("You are not logged in");
        }
    }

    private void SubtractFromAmount(double amount) {
        double start_amount = this.current_amount;
        this.current_amount += amount;
        if (this.current_amount < -250) {
            System.out.println("Your new Balance is lower then -250 which is forbidden");
            System.out.println("Transaction is being rolled back");
            this.current_amount = start_amount;
        } else if (this.current_amount <= 0) {
            System.out.println("Wach out your balance is negative");
            System.out.println("It cant be lower then -250");
        }
    }

    private void AddFromAmount(double amount) {
        this.current_amount += amount;
        System.out.println("Amount is being added to your Account");
    }

    public void DisplayCurrentAmount(LoginSystem account) {
        if (account.loginState) {
            System.out.printf("Balance: %s\n", this.current_amount);
        }
    }
}