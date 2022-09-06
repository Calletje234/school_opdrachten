public class Main {
    public static void main(String[] arg){
        userInput user = new userInput();
        boolean run = true;
        while (run){
            user.displayExplanation();
            run = user.getCommand();
        }
    }
}
