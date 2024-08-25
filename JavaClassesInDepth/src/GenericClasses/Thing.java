package GenericClasses;

public class Thing <T extends ParentClass & CarFacade & BirdFacade>{
    T value;

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Rama", "UK-3214 22","Eagle", "HawkEag","Black","BlackHawk12345");
        Thing<ChildClass> childClassThing = new Thing<>();
    }
}