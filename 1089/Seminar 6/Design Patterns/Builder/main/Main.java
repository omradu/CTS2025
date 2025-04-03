public class Main {
    public static void main(String[] args) {

        Film film = new Film.FilmBuilder("Babrie", 2023).addLimbaProductie("engleza").addRatingIMDB(7).esteDisponibilIn4D().build();
        Film2 film2 = new Film2.FilmBuilder2("Avatar", 2009).addGen("actiune").addDurataInMinute(100).build();

        Director director = new Director(new FilmBuilder3("Dune 2", 2024));
        director.build();
        Film film3 = director2.getFilm();

    }
}
