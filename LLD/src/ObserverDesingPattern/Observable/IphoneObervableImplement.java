package ObserverDesingPattern.Observable;

import ObserverDesingPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObervableImplement implements StockObservable{
    List<NotificationObserver> observerList = new ArrayList<>();
    public int iphoneStockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver obs : observerList){
            obs.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(iphoneStockCount == 0){
            notifySubscribers();
        }
        iphoneStockCount = iphoneStockCount + newStockAdded;
    }

    @Override
    public int getStockCount(){
        return iphoneStockCount;
    }

}
