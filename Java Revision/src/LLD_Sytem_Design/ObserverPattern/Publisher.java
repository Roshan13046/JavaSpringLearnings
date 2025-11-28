package LLD_Sytem_Design.ObserverPattern;

public interface Publisher {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers(Double temperature);
}
