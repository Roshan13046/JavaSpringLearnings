package GenericClasses;

public class Thing2 <T extends ParentClass & CarFacade & BirdFacade>{
    T value;

    public static void main(String[] args) {
        ChildClass2 childClass2 = new ChildClass2("Eagle", "HawkEag","Black","BlackHawk12345");
        //Not allowed as ChildClass2 should be implementing similarly like Thing2 format:
        // extends ParentClass & CarFacade & BirdFacade
//        Thing2<ChildClass2> childClassThing = new Thing2<>();//ERROR
    }
}