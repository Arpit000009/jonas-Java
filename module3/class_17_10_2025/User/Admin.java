package module3.class_17_10_2025.User;

public class Admin implements User{
    @Override
    public void login(){
        System.out.println("admin loginm sucessfully");
    }
    @Override
    public void logout(){
        System.out.println("admin logout sucessfully");
    }
}
