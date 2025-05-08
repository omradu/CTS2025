public class BusToTrainClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem{
    @Override
    public void reserveTicket(int wagonNb, int seatNb) {
        super.reserveSeat();
    }
}
