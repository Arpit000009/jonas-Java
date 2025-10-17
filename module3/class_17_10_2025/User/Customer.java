package module3.class_17_10_2025.User;


public class Customer implements User{
    @Override
    public void login(){
        System.out.println("Customer login susessfully");
    }

    @Override
    public void logout(){
    System.out.println("COustomer logout sucessfully");
    }
}
