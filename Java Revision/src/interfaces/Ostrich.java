package interfaces;

public  abstract class Ostrich implements Bird{

    protected abstract void canRun();

    @Override
    public void canFly(){
        System.out.println("OSTRICH cannot fly");
    }
}
