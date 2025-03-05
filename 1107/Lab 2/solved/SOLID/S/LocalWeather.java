class LocalWeather{

    Location location;

    public LocalWeather() {
        location = new Location();
    }


    public int getCurrentTemp() {
        double latitude = location.getLatitude();
        double longtitude = location.getLongitude();

        return 0;
    }

}
