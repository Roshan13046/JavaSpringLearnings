package MultiThreading.MonitorLockExample;

public class MonitorThread1Runnable implements Runnable {

    MonitorLock monitorLock;

    MonitorThread1Runnable(MonitorLock monitorLock){
       this.monitorLock = monitorLock;
    }

    @Override
    public void run() {
        monitorLock.task1();
    }
}
