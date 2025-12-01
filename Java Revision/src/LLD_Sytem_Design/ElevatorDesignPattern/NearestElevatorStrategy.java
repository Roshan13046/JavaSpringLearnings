package LLD_Sytem_Design.ElevatorDesignPattern;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, Direction requestDirection, int requestFloor) {
        ElevatorController bestElevatorController = null;
        int nearestFloor = Integer.MAX_VALUE;

        for(ElevatorController elevatorController : elevatorControllers){
            if(elevatorController.elevator.direction == requestDirection){
                if((requestDirection == Direction.UP && requestFloor >= elevatorController.elevator.nextFloorStoppage)
                || (requestDirection == Direction.DOWN && requestFloor <= elevatorController.elevator.nextFloorStoppage)
                ){
                    if(nearestFloor > Math.abs(requestFloor - elevatorController.elevator.nextFloorStoppage)){
                        bestElevatorController =  elevatorController;
                        nearestFloor = Math.abs(requestFloor - elevatorController.elevator.nextFloorStoppage);
                    }
                }
            }
        }

        if(bestElevatorController == null){
            for(ElevatorController elevatorController : elevatorControllers){
                if(elevatorController.elevator.direction == Direction.IDLE){
                    bestElevatorController = elevatorController;
                    break;
                }
            }
        }

        if(bestElevatorController == null){
            bestElevatorController = elevatorControllers.get(0);//getting the first elevator
        }

        return  bestElevatorController;
    }
}
