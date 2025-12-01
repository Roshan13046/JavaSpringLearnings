package LLD_Sytem_Design.ElevatorDesignPattern;

public class ExternalButton {
    ExternalDispatcher externalDispatcher;

    ExternalButton(ExternalDispatcher externalDispatcher){
        this.externalDispatcher = externalDispatcher;
    }
    public void pressButton(int floor, Direction direction){
        externalDispatcher.submitExternalRequest(floor, direction);
    }
}
