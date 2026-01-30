

/*
Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
 */
//Main Class
public class Second_Quest {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        BookingThread t1 = new BookingThread(booking);
        BookingThread t2 = new BookingThread(booking);
        //First start T1 Thread
        t1.start();

        //now second thread start
        t2.start();

    }
}
//created a class containing Synchronized Method
class TicketBooking{
    //-------Synchronized Method ---------
    synchronized void seatBookingMethod(){
        //showing thread name
        System.out.println(Thread.currentThread().getName());
            System.out.println("currently seat is selected by user for 10 second");
            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        System.out.println(Thread.currentThread().getName() + " exiting synchronized METHOD");
    }

    // -------- Synchronized Block --------
    void bookSeatBlock() {
        System.out.println(Thread.currentThread().getName() + " trying to enter synchronized BLOCK");

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " entered synchronized BLOCK");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " exiting synchronized BLOCK");
        }
    }
}
// ---- Thread Class ------------
class BookingThread extends Thread{

    TicketBooking booking ;

    BookingThread(TicketBooking booking){
        this.booking = booking;
    }
    public void run(){
        booking.seatBookingMethod(); // synchronized method
        booking.bookSeatBlock();  // synchronized block
    }
}


