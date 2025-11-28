package LLD_Sytem_Design.ObserverPattern;

public class MobileObserver implements  Observer{

    @Override
    public void notifyTemperature(Double temperature){
        System.out.println("Mobile update of temperature " + temperature);
    }
}
