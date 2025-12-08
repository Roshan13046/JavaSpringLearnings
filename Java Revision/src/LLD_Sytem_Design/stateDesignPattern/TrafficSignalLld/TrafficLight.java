package LLD_Sytem_Design.stateDesignPattern.TrafficSignalLld;

public class TrafficLight {
    private TrafficLightState trafficLightState;

    public TrafficLight(){
        this.trafficLightState = new RedState();
    }

    public void setState(TrafficLightState state){
        this.trafficLightState = state;
    }

    public void change(){
        trafficLightState.action(this);
    }
}
