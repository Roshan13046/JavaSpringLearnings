package LLD_Sytem_Design.ElevatorDesignPattern;

import java.util.List;

public class LeastBusyElevatorStrategy implements ElevatorSelectionStrategy{

    @Override
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, Direction direction, int floor) {
        ElevatorController bestElevatorController = null;
        int lessLoad = Integer.MAX_VALUE;

        for(ElevatorController elevatorController : elevatorControllers){
            int load = elevatorController.upMinPQ.size() + elevatorController.downMaxPQ.size();
            if(lessLoad > load){
                lessLoad = load;
                bestElevatorController = elevatorController;
            }
        }

        return bestElevatorController;
    }
}
