public class Main {
    public static void main(String[] arg){
        User user = new User();
        BmiCalculator calculator = new BmiCalculator();
        user.createUser();
        double result = calculator.calculateBmi(user.getWeight(), user.getLength());
        calculator.displayResult(result);
    }
}
