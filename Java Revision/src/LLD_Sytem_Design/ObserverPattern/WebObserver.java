package LLD_Sytem_Design.ObserverPattern;

public class WebObserver implements Observer{

    @Override
    public void notifyTemperature(Double temperature) {
        System.out.println("Web update of temperature: " + temperature);
    }
}
