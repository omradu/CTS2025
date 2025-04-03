public abstract class AbstractMovieBuilder {
    public abstract AbstractMovieBuilder addGenre(String genre);
    public abstract AbstractMovieBuilder hasAgeLimit();
    public abstract AbstractMovieBuilder addIMDBRating(double rating);
    public abstract AbstractMovieBuilder addDurationInMinutes(double duration);
    public abstract AbstractMovieBuilder addTicketsSold(int ticketsSold);
    public abstract AbstractMovieBuilder isAvailableIn4D();
    public abstract Movie build();
}
