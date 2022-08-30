import java.lang.Math;


public class BmiCalculator {

    double power = 2;

    public double calculateBmi(double weight, double length) {
        return weight / (Math.pow(length, power));
    }

    public void displayResult(double calculatedBmi) {
        long rounded_bmi = Math.round(calculatedBmi);
        if(calculatedBmi > 30) {
            System.out.println("You have obesity");
            System.out.printf("Your bmi is: %s%n", rounded_bmi);
        } else if (calculatedBmi < 30 && calculatedBmi >= 25) {
            System.out.println("You have overweight");
            System.out.printf("Your bmi is: %s%n", rounded_bmi);
        } else if (calculatedBmi < 25 && calculatedBmi >= 18.5) {
            System.out.println("You have the correct weight");
            System.out.printf("Your bmi is: %s%n", rounded_bmi);
        } else if (calculatedBmi < 18) {
            System.out.println("You have underweight");
            System.out.printf("Your bmi is: %s%n", rounded_bmi);
        }
    }
}