package module3.j;

public class movieTicketBooking extends Thread{
    static seatbooking sb;
    int seats;
    @Override
    public void run(){
        sb.bookSheats(seats);
    }
    public static void main(String[] args){
        sb = new seatbooking();
        movieTicketBooking user1 = new movieTicketBooking();
        user1.seats = 3;
        user1.start();
        try{
            user1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        movieTicketBooking user2 = new movieTicketBooking();
        user2.seats = 3;
        user2.start();

        try {
            user2.join();
            System.out.println("second");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
