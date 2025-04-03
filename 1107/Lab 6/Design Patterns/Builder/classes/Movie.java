public class Movie {

    String title;
    int releaseYear;
    String genre;
    boolean hasAgeLimit;
    double imdbRating;
    int durationInMinutes;
    String language;
    boolean isAvailableIn4D;

     Movie() {

    }

    private Movie(String title, int releaseYear, String genre, boolean hasAgeLimit, double imdbRating, int durationInMinutes, String language, boolean isAvailableIn4D) {
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

    public static class MovieBuilder {
        private Movie movie = null;

        public MovieBuilder(String  title, int releaseYear) {
            this.movie = new Movie();
            this.movie.title = title;
            this.movie.releaseYear = releaseYear;
        }

        public MovieBuilder addGenre(String genre) {
            this.movie.genre = genre;
            return this;
        }

        public MovieBuilder hasAgeLimit() {
            this.movie.hasAgeLimit = true;
            return this;
        }

        public MovieBuilder addIMDBRating(double rating) {
            this.movie.imdbRating = rating;
            return this;
        }

        public MovieBuilder addDurationInMinutes(int durationInMinutes) {
            this.movie.durationInMinutes = durationInMinutes;
            return this;
        }

        public MovieBuilder addLanguage(String language) {
            this.movie.language = language;
            return this;
        }

        public MovieBuilder isAvailableIn4D() {
            this.movie.isAvailableIn4D = true;
            return this;
        }

        public Movie build() {
            return this.movie;
        }
    }
}
