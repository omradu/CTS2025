public abstract class AbstractFilmBuilder {
    public abstract AbstractFilmBuilder addGen(String genul);
    public abstract AbstractFilmBuilder areLimitaVarsta();
    public abstract AbstractFilmBuilder addRatingIMDB(double rating);
    public abstract AbstractFilmBuilder addDurataInMinute(double durata);
    public abstract AbstractFilmBuilder addLimbaProductie(String limbaProductie);
    public abstract AbstractFilmBuilder esteDisponibilIn4D();
    public abstract AbstractFilmBuilder addAnProductie(int anProductie);
    public abstract Film build();
}
