package LLD_Sytem_Design.ElevatorDesignPattern;

public class ExternalDispatcher {
    ElevatorScheduler elevatorScheduler;

    public void submitExternalRequest(int floor, Direction direction){
        ElevatorController elevatorController = elevatorScheduler.getSuitableElevatorController(floor, direction);
        elevatorController.submitRequest(floor);
    }
}
