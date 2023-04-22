package MVC1;

public class UserController {
    private UserModel userModel;
    private UserView userView;

    public UserController(UserModel userModel, UserView userView) {
        this.userModel = userModel;
        this.userView = userView;
    }

    public void createUser(String username, String password) {
        userModel = new UserModel(username, password);
        userView.printUserDetails(userModel.getUsername(), userModel.getPassword());
    }
}
