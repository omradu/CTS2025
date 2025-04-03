public class Film {
    String titlu;
    int anAparitie;
    String gen;
    boolean areLimitaVarsta;
    double ratingIMDB;
    int durataInMinute;
    String limbaProductie;
    boolean esteDisponibilIn4D;
    int anProductie;

    Film() {

    }

    public Film(String titlu, int anAparitie, String gen, boolean areLimitaVarsta, double ratingIMDB, int durataInMinute, String limbaProductie, boolean esteDisponibilIn4D, int anProductie) {
        this.titlu = titlu;
        this.anAparitie = anAparitie;
        this.gen = gen;
        this.areLimitaVarsta = areLimitaVarsta;
        this.ratingIMDB = ratingIMDB;
        this.durataInMinute = durataInMinute;
        this.limbaProductie = limbaProductie;
        this.esteDisponibilIn4D = esteDisponibilIn4D;
        this.anProductie = anProductie;
    }

    public String getTitlu() {
        return titlu;
    }

    private void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    private void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getGen() {
        return gen;
    }

    private void setGen(String gen) {
        this.gen = gen;
    }

    public boolean isAreLimitaVarsta() {
        return areLimitaVarsta;
    }

    private void setAreLimitaVarsta(boolean areLimitaVarsta) {
        this.areLimitaVarsta = areLimitaVarsta;
    }

    public double getRatingIMDB() {
        return ratingIMDB;
    }

    private void setRatingIMDB(double ratingIMDB) {
        this.ratingIMDB = ratingIMDB;
    }

    public int getDurataInMinute() {
        return durataInMinute;
    }

    private void setDurataInMinute(int durataInMinute) {
        this.durataInMinute = durataInMinute;
    }

    public String getlimbaProductie() {
        return limbaProductie;
    }

    private void setLimbaProductie(String limbaProductie) {
        this.limbaProductie = limbaProductie;
    }

    public boolean isEsteDisponibilIn4D() {
        return esteDisponibilIn4D;
    }

    private void setEsteDisponibilIn4D(boolean esteDisponibilIn4D) {
        this.esteDisponibilIn4D = esteDisponibilIn4D;
    }

    public int getAnProductie() {
        return anProductie;
    }

    private void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    public static class FilmBuilder {
        private Film film = null;

        public FilmBuilder(String  titlu, int anAparitie) {
            this.film = new Film();
            this.film.titlu = titlu;
            this.film.anAparitie = anAparitie;
        }

        public FilmBuilder addGen(String gen) {
            this.film.gen = gen;
            return this;
        }

        public FilmBuilder areLimitaVarsta() {
            this.film.areLimitaVarsta = true;
            return this;
        }

        public FilmBuilder addRatingIMDB(double rating) {
            this.film.ratingIMDB = rating;
            return this;
        }

        public FilmBuilder addDurataInMinute(int durata) {
            this.film.durataInMinute = durata;
            return this;
        }

        public FilmBuilder addLimbaProductie(String limbaProductie) {
            this.film.limbaProductie = limbaProductie;
            return this;
        }

        public FilmBuilder esteDisponibilIn4D() {
            this.film.esteDisponibilIn4D = true;
            return this;
        }

        public FilmBuilder addAnProductie(int anProductie) {
            this.film.anProductie = anProductie;
            return this;
        }

        public Film build() {
            return this.film;
        }
    }
}
