package LLD_Sytem_Design.ElevatorDesignPattern;

import java.util.List;

public class ElevatorScheduler {
    List<ElevatorController> controllerList;
    ElevatorSelectionStrategy elevatorSelectionStrategy;

    ElevatorScheduler(List<ElevatorController> controllerList, ElevatorSelectionStrategy elevatorSelectionStrategy){
        this.controllerList = controllerList;
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public ElevatorController getSuitableElevatorController(int destinationFloor, Direction direction){
        return  elevatorSelectionStrategy.selectElevator(controllerList,direction,destinationFloor);
    }
}
