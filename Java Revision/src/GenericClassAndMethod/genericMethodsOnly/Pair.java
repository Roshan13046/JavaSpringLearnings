package GenericClassAndMethod.genericMethodsOnly;

public class Pair<K,V> {
    private K key;
    private V val;

    public void setPair(K key, V val){
        this.key = key;
        this.val = val;
    }

   public K getKey(){
        return key;
   }

   public V getVal( ){
       return val;
   }
}
