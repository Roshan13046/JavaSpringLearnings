package MonitorLocks;

public class MonitorLockRunnable implements Runnable{

    MonitorLockExample monitorLockExample;

    public MonitorLockRunnable(MonitorLockExample monitorLockExample) {
        this.monitorLockExample = monitorLockExample;
    }

    @Override
    public void run() {
        monitorLockExample.task1();
    }
}
