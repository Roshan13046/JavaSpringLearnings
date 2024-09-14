package InterfaceFeaturesInJava8AndJava9.TypesOfFunctionalInterfaces;

@FunctionalInterface
public interface Predicate <T>{
    Boolean testGreater(T val);
}
