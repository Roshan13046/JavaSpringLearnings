package GenericClassAndMethod.genericMethodsOnly;

public class Print {

    public <T> void printData(T data){
        System.out.println(data);
    }

    public <K,V> void printData(Pair<K,V> pair1, Pair<K,V> pair2){
        if(pair1.getVal().equals(pair2.getVal())){
            System.out.println("Equal pair address {} " + pair1.getKey()+" "+ pair2.getKey());
        }
    }
}
