import java.util.ArrayList;

public class BankAccount {

    private final ArrayList<Double> subtractTransactionList;
    private final ArrayList<Double> addTransactionList;
    private double currentAmount;

    public BankAccount()
    {
        this.currentAmount = 0;
        this.subtractTransactionList = new ArrayList<>();
        this.addTransactionList = new ArrayList<>();
    }


    public void TransAction(double amount, LoginSystem account) {
        if (account.loginState) {
            if (amount < 0) {
                SubtractFromAmount(amount);
                addSubtractedAmount(amount);
            } else {
                AddFromAmount(amount);
                addAddedAmount(amount);
            }
        } else {
            System.out.println("You are not logged in");
        }
    }

    private void addSubtractedAmount(double subtracted_amount) {
        this.subtractTransactionList.add(subtracted_amount);
    }

    private void addAddedAmount(double added_amount) {
        this.addTransactionList.add(added_amount);
    }

    public ArrayList<Double> taken_amount() {
        return this.subtractTransactionList;
    }

    public ArrayList<Double> added_amount(){
        return this.addTransactionList;
    }

    private void SubtractFromAmount(double amount) {
        double start_amount = this.currentAmount;
        this.currentAmount += amount;
        if (this.currentAmount < -250) {
            System.out.println("Your new Balance is lower then -250 which is forbidden");
            System.out.println("Transaction is being rolled back");
            this.currentAmount = start_amount;
        } else if (this.currentAmount <= 0) {
            System.out.println("Watch out your balance is negative");
            System.out.println("It cant be lower then -250");
        }
    }

    private void AddFromAmount(double amount) {
        this.currentAmount += amount;
        System.out.println("Amount is being added to your Account");
    }

    public void DisplayCurrentAmount(LoginSystem account) {
        if (account.loginState) {
            System.out.printf("Balance: %s\n", this.currentAmount);
        }
    }
}