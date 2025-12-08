package LLD_Sytem_Design.stateDesignPattern.TrafficSignalLld;

public class RedState implements TrafficLightState{

    @Override
    public void action(TrafficLight trafficLight) {
        //STOP behaviour
        System.out.println("Red Signal: STOP");
        trafficLight.setState(new GreenState());
    }
}
