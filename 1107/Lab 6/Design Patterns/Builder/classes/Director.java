public class Director {
    AbstractMovieBuilder builder;

    public Director(AbstractMovieBuilder builder) {
        this.builder = builder;
    }

    public Movie getMovie() {
        return this.builder.build();
    }

    public void build() {
        this.builder.addDurationInMinutes(100);
        this.builder.addGenre("horror");
    }
}
