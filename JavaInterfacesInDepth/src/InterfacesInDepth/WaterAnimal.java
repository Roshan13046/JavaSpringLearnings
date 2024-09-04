package InterfacesInDepth;

public interface WaterAnimal {
    //methods cannot be final in interfaces
     public void canBreath();

     //interfaces fields cannot be private or protected and are by default public static final
     public static final Integer MAX_LENGTH = 2000;
     Integer MAX_WIGHT = 9000;
}
