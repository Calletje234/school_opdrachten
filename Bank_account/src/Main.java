public class Main {
    public static void main(String[] arg){
        userInput user = new userInput();
        boolean run;
        do {
            user.displayExplanation();
            run = user.getCommand();
        } while(run);
    }
}
