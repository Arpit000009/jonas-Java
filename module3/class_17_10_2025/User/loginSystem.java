package module3.class_17_10_2025.User;

public class loginSystem {
    public static void main(String[] args) {
        User user1 = UserCreation.UserCreatePassword(123);
        user1.login();
        user1.logout();
    }
}
