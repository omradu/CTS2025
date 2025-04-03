public class Film2 {
    String titlu;
    int anAparitie;
    String gen;
    boolean areLimitaVarsta;
    double ratingIMDB;
    int durataInMinute;
    String limbaProductie;
    boolean esteDisponibilIn4D;
    int anProductie;

    private Film2() {

    }

    private Film2(String titlu, int anAparitie, String gen, boolean areLimitaVarsta, double ratingIMDB, int durataInMinute, String limbaProductie, boolean esteDisponibilIn4D, int anProductie) {
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

    public String getLimbaProductie() {
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

    public static class FilmBuilder2 {
        String titlu;
        int anAparitie;
        String gen;
        boolean areLimitaVarsta;
        double ratingIMDB;
        int durataInMinute;
        String limbaProductie;
        boolean esteDisponibilIn4D;
        int anProductie;

        public FilmBuilder2(String  titlu, int anAparitie) {
            this.titlu = titlu;
            this.anAparitie = anAparitie;
        }

        public FilmBuilder2 addGen(String gen) {
            this.gen = gen;
            return this;
        }

        public FilmBuilder2 areLimitaVarsta() {
            this.areLimitaVarsta = true;
            return this;
        }

        public FilmBuilder2 addRatingIMDB(double rating) {
            this.ratingIMDB = rating;
            return this;
        }

        public FilmBuilder2 addDurataInMinute(int durata) {
            this.durataInMinute = durata;
            return this;
        }

        public FilmBuilder2 addBileteVandute(String limbaProductie) {
            this.limbaProductie = limbaProductie;
            return this;
        }

        public FilmBuilder2 esteDisponibilIn4D() {
            this.esteDisponibilIn4D = true;
            return this;
        }

        public FilmBuilder2 addAnProductie(int anProductie) {
            this.anProductie = anProductie;
            return this;
        }

        public Film2 build() {
            //Film2 film = new Film2((titlu, anAparitie, gen, areLimitaVarsta, ratingIMDB, durataInMinute, limbaProductie, esteDisponibilIn4D, anProductie);
            Film2 film = new Film2();
            film.anAparitie = anAparitie;
            film.anProductie = anProductie;
            film.areLimitaVarsta = areLimitaVarsta;
            film.limbaProductie = limbaProductie;
            film.durataInMinute = durataInMinute;
            film.esteDisponibilIn4D = esteDisponibilIn4D;
            film.gen = gen;
            film.titlu = titlu;
            return film;
        }
    }
}
