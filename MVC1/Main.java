package MVC1;

public class Main {
    public static void main(String[] args) {
        UserModel userModel = new UserModel("", "");
        UserView userView = new UserView(new UserController(userModel, new UserView(null)));
        userView.getUserDetailsFromUser();
    }
}
