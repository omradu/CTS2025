public class MovieBuilder3 extends AbstractMovieBuilder{
    Movie movie;

    public MovieBuilder3(String title, int releaseYear) {
        this.movie = new Movie();
        //Aici nu mai avem acces la zona privata
        // cu default package level
        movie.title = title;
        movie.releaseYear = releaseYear;
    }

    @Override
    public AbstractMovieBuilder addGenre(String genre) {
    //TO DO
    }

    @Override
    public AbstractMovieBuilder hasAgeLimit() {
//TO DO
    }

    @Override
    public AbstractMovieBuilder addIMDBRating(double rating) {
//TO DO
    }

    @Override
    public AbstractMovieBuilder addDurationInMinutes(double duration) {
//TO DO
    }

    @Override
    public AbstractMovieBuilder addLanguage(String language) {
//TO DO
    }

    @Override
    public AbstractMovieBuilder isAvailableIn4D() {
//TO DO
    }

    @Override
    public Movie build() {
        return this.movie;
    }
}
