package NestedInterface;

//Implementing the outer interface
public class Eagle implements Birds{
    @Override
    public void canFly() {
        System.out.println("Eagle can fly");
    }
}
