public class MobileDevice implements Notifier{

    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if(weatherConditions == "rainy") {
            System.out.println("It is rainy");
        }
    }
}
