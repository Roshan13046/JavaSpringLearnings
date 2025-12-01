package LLD_Sytem_Design.ElevatorDesignPattern;

import java.util.List;

public interface ElevatorSelectionStrategy {
    ElevatorController selectElevator(List<ElevatorController> elevatorControllers, Direction direction, int floor );
}
