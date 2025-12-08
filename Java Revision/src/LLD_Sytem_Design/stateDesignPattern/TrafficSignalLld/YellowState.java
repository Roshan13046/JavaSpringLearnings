package LLD_Sytem_Design.stateDesignPattern.TrafficSignalLld;

public class YellowState implements TrafficLightState{

    @Override
    public void action(TrafficLight trafficLight) {
        System.out.println("Yellow Signal: Slow Down");
        trafficLight.setState(new RedState());
    }
}
