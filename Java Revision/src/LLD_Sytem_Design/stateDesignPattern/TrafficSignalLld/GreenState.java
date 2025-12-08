package LLD_Sytem_Design.stateDesignPattern.TrafficSignalLld;

public class GreenState implements TrafficLightState {

    @Override
    public void action(TrafficLight trafficLight) {
        System.out.println("Green Signal: Move");
        trafficLight.setState(new YellowState());
    }
}
