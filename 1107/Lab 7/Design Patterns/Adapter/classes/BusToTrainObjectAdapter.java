public class BusToTrainObjectAdapter implements AbstractTrainTicketingSystem{
    private AbstractBusTicketingSystem busTicketingSystem;

    public BusToTrainObjectAdapter(AbstractBusTicketingSystem busTicketingSystem) {
        this.busTicketingSystem = busTicketingSystem;
    }

    @Override
    public void reserveTicket(int wagonNb, int seatNb) {
        busTicketingSystem.reserveSeat();
    }
}
