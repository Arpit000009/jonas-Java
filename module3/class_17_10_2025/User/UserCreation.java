package module3.class_17_10_2025.User;

public class UserCreation {
    public static User UserCreatePassword(int pwd){
        User user;
        if(pwd==123){
            user = new Customer();
        }
        else{
            user = new Admin();
        }
        return user;
    }
}
