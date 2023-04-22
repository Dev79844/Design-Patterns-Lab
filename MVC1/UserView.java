package MVC1;
import java.util.Scanner;

public class UserView {
    private UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void printUserDetails(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public void getUserDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        userController.createUser(username, password);
    }
}
