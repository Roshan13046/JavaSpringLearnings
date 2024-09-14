package InterfaceFeaturesInJava8AndJava9.TypesOfFunctionalInterfaces;

@FunctionalInterface
public interface Function <T, R>{
    R apply(T val);
}
