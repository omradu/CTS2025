public class BusTicketingSystem implements AbstractBusTicketingSystem{
    private int numberOfSeats = 50;
    private int numberBookedSeats = 0;

    @Override
    public void reserveSeat() {
        if(numberBookedSeats < numberOfSeats) {
            numberBookedSeats++;
            System.out.println("Seat booked");
        }
    }
}
