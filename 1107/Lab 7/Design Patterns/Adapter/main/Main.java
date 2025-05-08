public class Main {
    public static void main(String[] args) {
        BusToTrainObjectAdapter adapter = new BusToTrainObjectAdapter(new BusTicketingSystem());
        adapter.reserveTicket(5,26);

        BusToTrainClassAdapter adapter1 = new BusToTrainClassAdapter();
        adapter1.reserveTicket(4, 29);
        adapter1.reserveSeat();
    }
}
