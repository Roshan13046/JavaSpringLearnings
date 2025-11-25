package wrapper;

import java.util.ArrayList;

final public class Wrapper {
    private int val;
    private ArrayList<String> arrayList;

    Wrapper(int val, ArrayList<String> arrayList){
        this.val = val;
        this.arrayList = arrayList;
    }

    public int getVal(){
        return val;
    }

    public ArrayList<String> getArrayList(){
        return new ArrayList<>(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ROSHAN");
        names.add("SHUBHAM");
        Wrapper wrapper = new Wrapper(1, names);

        System.out.println(wrapper.getArrayList());

//        wrapper.getArrayList().add("RAKESH");
        System.out.println("After adding  " + wrapper.getArrayList());
    }

}
