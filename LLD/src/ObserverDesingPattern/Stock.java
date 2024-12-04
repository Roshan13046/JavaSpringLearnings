package ObserverDesingPattern;

import ObserverDesingPattern.Observable.IphoneObervableImplement;
import ObserverDesingPattern.Observable.StockObservable;
import ObserverDesingPattern.Observer.EmailAlertObserverImpl;
import ObserverDesingPattern.Observer.MobileAlertObserverImpl;
import ObserverDesingPattern.Observer.NotificationObserver;

public class Stock {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObervableImplement();

        NotificationObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com" , iphoneStockObservable);
        NotificationObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com" , iphoneStockObservable);
        NotificationObserver observer3 = new MobileAlertObserverImpl("+91 234567543" , iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
