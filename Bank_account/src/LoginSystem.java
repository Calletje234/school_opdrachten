import java.util.Objects;
import java.util.Scanner;


public class LoginSystem {
    private String name;
    private String password;
    public boolean loginState = false;
    Scanner scanner = new Scanner(System.in);

    public LoginSystem(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void login(String name, String password) {
        if(Objects.equals(name, this.name) && Objects.equals(password, this.password)){
            this.loginState = true;
            System.out.println("Your now logged in.");
        } else {
            System.out.println("Wrong password / name");
        }
    }

    public void logOut(){
        System.out.println("Please confirm logout (Y/N)");
        String confirm = scanner.nextLine();
        if(Objects.equals(confirm, "Y")){
            loginState = false;
        }
    }

    public void changePassword(){
        System.out.println("Please enter your current password");
        String curPassword = scanner.nextLine();
        if(Objects.equals(curPassword, this.password)){
            System.out.println("Type new password");
            this.password = scanner.nextLine();
        }
    }

    public void changeName() {
        System.out.println("Please enter your current password");
        String curPassword = scanner.nextLine();
        if(Objects.equals(curPassword, this.password)){
            System.out.println("Type new name");
            name = scanner.nextLine();
        }
    }
}
