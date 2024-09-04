package NestedInterface;

public interface Birds {
    public void canFly();

    public interface NonFlyingBirds{
        public void canRun();
    }
}
