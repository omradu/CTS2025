class LocalWeather{

    Location location;

    public LocalWeather() {
        location = new Location(0,0);
    }


    public int getCurrentTemp() {
        double latitude = location.getLatitude();
        //double longtitude = location.getLongitude();

        return 0;
    }

}
