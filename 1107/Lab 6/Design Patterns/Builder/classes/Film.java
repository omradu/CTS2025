public class Film {

    String title;
    int releaseYear;
    String genre;
    boolean hasAgeLimit;
    double imdbRating;
    int durationInMinutes;
    String language;
    boolean isAvailableIn4D;

    private Film() {

    }

    private Film(String title, int releaseYear, String genre, boolean hasAgeLimit, double imdbRating, int durationInMinutes, String language, boolean isAvailableIn4D) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.hasAgeLimit = hasAgeLimit;
        this.imdbRating = imdbRating;
        this.durationInMinutes = durationInMinutes;
        this.language = language;
        this.isAvailableIn4D = isAvailableIn4D;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    private void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHasAgeLimit() {
        return hasAgeLimit;
    }

    private void setHasAgeLimit(boolean hasAgeLimit) {
        this.hasAgeLimit = hasAgeLimit;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    private void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    private void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getLanguage() {
        return language;
    }

    private void setLanguage(String language) {
        this.language = language;
    }

    public boolean isAvailableIn4D() {
        return isAvailableIn4D;
    }

    private void setAvailableIn4D(boolean availableIn4D) {
        isAvailableIn4D = availableIn4D;
    }

    public static class FilmBuilder {
        String title;
        int releaseYear;
        String genre;
        boolean hasAgeLimit;
        double imdbRating;
        int durationInMinutes;
        String language;
        boolean isAvailableIn4D;

        public FilmBuilder(String  title, int releaseYear) {
            this.title = title;
            this.releaseYear = releaseYear;
        }

        public FilmBuilder addGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public FilmBuilder hasAgeLimit() {
            this.hasAgeLimit = true;
            return this;
        }

        public FilmBuilder addIMDBRating(double rating) {
            this.imdbRating = rating;
            return this;
        }

        public FilmBuilder addDurationInMinutes(int durationInMinutes) {
            this.durationInMinutes = durationInMinutes;
            return this;
        }

        public FilmBuilder addLanguage(String language) {
            this.language = language;
            return this;
        }

        public FilmBuilder isAvailableIn4D() {
            this.isAvailableIn4D = true;
            return this;
        }

        publicFilm build() {
            //Film movie = new Film(this.title, this.releaseYear, this.genre, this.hasAgeLimit, this.imdbRating, this.durationInMinutes, this.language, this.isAvailableIn4D);
            
            Film film = new Film();
            film.title = this.title;
            film.releaseYear = this.releaseYear;
            film.genre = genre;
            film.hasAgeLimit = this.hasAgeLimit;
            film.imdbRating = this.imdbRating;
            film.durationInMinutes = this.durationInMinutes;
            film.language = this.language;
            film.isAvailableIn4D = this.isAvailableIn4D;

            return film;
        }
    }
}
