package LLD_Sytem_Design.ElevatorDesignPattern;

public class Floor {
    int floor;
    ExternalButton upButton, downButton;

    Floor(int floor, ExternalDispatcher dispatcher){
        this.floor = floor;
        this.upButton = new ExternalButton(dispatcher);
        this.downButton = new ExternalButton(dispatcher);
    }

    public void pressUpButton(int floor){
        upButton.externalDispatcher.submitExternalRequest(floor, Direction.UP);
    }

    public void pressDownButton(int floor){
        downButton.externalDispatcher.submitExternalRequest(floor, Direction.DOWN);
    }
}
