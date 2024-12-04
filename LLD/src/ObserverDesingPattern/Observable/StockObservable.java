package ObserverDesingPattern.Observable;

import ObserverDesingPattern.Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();
}
