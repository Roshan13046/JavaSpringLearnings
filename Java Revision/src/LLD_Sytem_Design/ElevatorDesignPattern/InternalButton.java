package LLD_Sytem_Design.ElevatorDesignPattern;

public class InternalButton {
    ElevatorController elevatorController;

    InternalButton(ElevatorController elevatorController){
        this.elevatorController = elevatorController;
    }

    public void submitInternalRequest(int floor){
        elevatorController.submitRequest(floor);
    }
}
