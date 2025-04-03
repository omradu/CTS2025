public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie.MovieBuilder("Avatar", 2009).addGenre("adventure").isAvailableIn4D().build();
        Film film = new Film.FilmBuilder("Avatar2", 2023).addGenre("adventure").isAvailableIn4D().build();

        Director director = new Director(new MovieBuilder3("Dune 2", 2024));
        director.build();
        Movie movie3 = director.getMovie();
    }
}
