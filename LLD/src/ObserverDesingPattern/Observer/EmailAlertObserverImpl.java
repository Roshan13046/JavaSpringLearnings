package ObserverDesingPattern.Observer;

import ObserverDesingPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationObserver {
    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        this.sendEmailNotification();
    }

    public void sendEmailNotification(){
        System.out.println("Email sent successfully to " + emailId);
    }
}
