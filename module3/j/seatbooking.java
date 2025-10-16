package module3.j;
public class seatbooking {
    int totalseats = 10;

    synchronized public void bookSheats(int seats){
        if(totalseats>=seats){
            System.out.println("seat booked sucessfully");
            totalseats -=seats;
            System.out.println("number of seats available is "+ totalseats);
        }
        else{
            System.out.println("seats not available");
        }
    }
}
