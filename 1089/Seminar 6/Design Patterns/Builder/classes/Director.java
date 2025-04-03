public class Director {
    AbstractFilmBuilder builder;

    public Director(AbstractFilmBuilder builder) {
        this.builder = builder;
    }

    public Film getFilm() {
        return this.builder.build();
    }

    public void build() {
        this.builder.addDurataInMinute(100);
        this.builder.addGen("comedie");
    }
}
