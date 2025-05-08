public class TrainTicketingSystem implements AbstractTrainTicketingSystem{
    private int numberOfWagons = 5;
    private int numberOfSeatsPerWagon = 100;
    private int numberOfBookedSeats = 0;

    @Override
    public void reserveTicket(int wagonNb, int seatNb) {
        boolean isValidWagon = wagonNb>0 && wagonNb<=numberOfWagons;
        boolean isValidSeat = seatNb>0 && seatNb<=numberOfSeatsPerWagon;
        if(isValidSeat && isValidWagon && numberOfBookedSeats<500){
            System.out.println("Ticket issued for wagon " +
                    wagonNb  + " and seat " + seatNb);
            numberOfBookedSeats++;
        }
    }
}
