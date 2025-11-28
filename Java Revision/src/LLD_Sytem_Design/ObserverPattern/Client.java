package LLD_Sytem_Design.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer webObserver = new WebObserver();
        Observer mobileObserver = new MobileObserver();

        weatherStation.addObserver(webObserver);
        weatherStation.addObserver(mobileObserver);

        weatherStation.isTemperatureAlertNeeded(43.0);
        weatherStation.isTemperatureAlertNeeded(-2.0);

        weatherStation.isTemperatureAlertNeeded(13.0);

    }
}
