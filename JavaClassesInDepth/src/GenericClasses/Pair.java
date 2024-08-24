package GenericClasses;

public class Pair <K,V>{
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void put(K key, V value){
        key = key;
        value = value;
    }

    public Pair<K,V> get(){
        Pair<K,V> temp = new Pair<>();
        temp.put(getKey(), getValue());
        return temp;
    }

    public static void main(String[] args) {
        Pair<String, Integer> stringCount = new Pair<>();
        Pair<Integer, Boolean> isIntegerPresent = new Pair<>();

        stringCount.put("Ram", 1);
        stringCount.put("Laxman",4);

        isIntegerPresent.put(23, Boolean.TRUE);
        isIntegerPresent.put(124, Boolean.FALSE);
        isIntegerPresent.put(456, Boolean.FALSE);

    }
}




