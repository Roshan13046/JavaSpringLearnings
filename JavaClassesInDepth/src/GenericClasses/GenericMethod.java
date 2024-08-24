package GenericClasses;

public class GenericMethod {
    public <K,V> void comparePair(Pair<K,V> pair1, Pair<K,V> pair2){
        if(pair1.getKey().equals(pair2.getKey()) && pair2.getValue().equals(pair2.getValue())){
            System.out.println("Pairs are identical");
        }else{
            System.out.println("Pair are not identical");
        }
    }

    //without return type
    //Making only one method generic
    public  <K,V> void printPair(Pair<K,V> pair1){
        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
    }

    //with return type
    public  <K,V> Pair<K,V> getPrintPair(Pair<K,V> pair1){
        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
        return pair1;
    }

    public static void main(String[] args) {
        Pair<String, Integer> stringCount1 = new Pair<>();
        Pair<String, Integer> stringCount2 = new Pair<>();
        Pair<String, Integer> stringCount3 = new Pair<>();

        GenericMethod genericMethod = new GenericMethod();

        stringCount1.put("Ram", 1);
        stringCount2.put("Ramesh",4);
        stringCount3.put("Ram", 1);

        genericMethod.comparePair(stringCount1, stringCount2);
        genericMethod.comparePair(stringCount1, stringCount3);

        Pair<Integer, Boolean> isIntegerPresent1 = new Pair<>();
        Pair<Integer, Boolean> isIntegerPresent2 = new Pair<>();

        isIntegerPresent1.put(23, Boolean.TRUE);
        isIntegerPresent2.put(2, Boolean.FALSE);
        genericMethod.comparePair(isIntegerPresent1.get(), isIntegerPresent2.get());

    }
}
