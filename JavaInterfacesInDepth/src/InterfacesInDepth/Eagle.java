package InterfacesInDepth;

public class Eagle implements FlyingBirds{
    //Interfaces is used to achieve full abstraction
    @Override
    public void canFly(){
        System.out.println("Eagles can fly high");
    }

    @Override
    public void canSpeak() {
        //complex logic
    }

    @Override
    public void canEat() {

    }

    @Override
    public void canBreath() {

    }
}
