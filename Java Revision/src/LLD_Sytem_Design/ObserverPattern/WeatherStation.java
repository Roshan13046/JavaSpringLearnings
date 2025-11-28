package LLD_Sytem_Design.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private List<Observer> observers;

    WeatherStation(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Double temperature){
        for(Observer observer: observers){
            observer.notifyTemperature(temperature);
        }
    }

    public void isTemperatureAlertNeeded(Double temperature){
        if(temperature<3 || temperature > 30){
            notifyAllObservers(temperature);
        }
    }
}
