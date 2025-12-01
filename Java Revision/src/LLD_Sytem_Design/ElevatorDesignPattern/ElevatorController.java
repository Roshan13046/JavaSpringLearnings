package LLD_Sytem_Design.ElevatorDesignPattern;

import java.util.concurrent.PriorityBlockingQueue;

public class ElevatorController implements Runnable {
    PriorityBlockingQueue<Integer> upMinPQ;
    PriorityBlockingQueue<Integer> downMaxPQ;
    Elevator elevator;

    private final Object monitor  = new Object();

    ElevatorController(Elevator elevator){
        this.elevator = elevator;
        upMinPQ = new PriorityBlockingQueue<>();
        downMaxPQ = new PriorityBlockingQueue<>(10, (a,b)-> b-a);
    }

    public void submitRequest(int destinationFloor){
        enqueRequest(destinationFloor);
    }

    public void enqueRequest(int destinationFloor){
        if(destinationFloor == elevator.nextFloorStoppage){
            return;
        }

        if(destinationFloor >= elevator.nextFloorStoppage){
            if(!upMinPQ.contains(destinationFloor)){
                upMinPQ.offer(destinationFloor);
            }
        }else{
            if(!downMaxPQ.contains(destinationFloor)){
                downMaxPQ.offer(destinationFloor);
            }
        }

        synchronized (monitor){
            monitor.notify();
        }

    }

    @Override
    public void run() {
        ;
    }
}
