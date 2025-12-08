package LLD_Sytem_Design.stateDesignPattern.TrafficSignalLld;

public class TrafficDemo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
    }
}
