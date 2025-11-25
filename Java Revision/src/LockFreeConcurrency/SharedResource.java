package LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    int counter = 0;
    AtomicInteger atomicCounter = new AtomicInteger(0);

    public void incrementAtomic(){
        atomicCounter.incrementAndGet();
    }

    public int getAtomicCounter(){
        return atomicCounter.get();
    }

    public void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
