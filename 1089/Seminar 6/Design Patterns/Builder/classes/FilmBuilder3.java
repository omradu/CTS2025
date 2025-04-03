public class FilmBuilder3 extends AbstractFilmBuilder{
    Film film;

    public FilmBuilder3(String titlu, int anAparitie) {
        this.film = new Film();
        //Aici nu mai avem acces la zona privata
        // cu default package level
        film.titlu = titlu;
        film.anAparitie = anAparitie;
    }


    @Override
    public AbstractFilmBuilder addGen(String genul) {
        //TO DO
    }

    @Override
    public AbstractFilmBuilder areLimitaVarsta() {
        //TO DO
    }

    @Override
    public AbstractFilmBuilder addRatingIMDB(double rating) {
        //TO DO
    }

    @Override
    public AbstractFilmBuilder addDurataInMinute(double durata) {
        //TO DO
    }

    @Override
    public AbstractFilmBuilder addLimbaProductie(String limbaProductie) {
        //TO DO
    }
    
    @Override
    public AbstractFilmBuilder esteDisponibilIn4D() {
        //TO DO
    }

    @Override
    public AbstractFilmBuilder addAnProductie(int anProductie) {
        //TO DO
    }

    @Override
    public Film build() {
        return film;
    }
}
