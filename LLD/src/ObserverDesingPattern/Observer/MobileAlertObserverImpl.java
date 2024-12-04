package ObserverDesingPattern.Observer;

import ObserverDesingPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationObserver {
    String mobileNo;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String mobileNo, StockObservable stockObservable) {
        this.mobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        this.sendMobileNotification();
    }

    public void sendMobileNotification(){
        System.out.println("Mobile message send to " + mobileNo);
    }
}
