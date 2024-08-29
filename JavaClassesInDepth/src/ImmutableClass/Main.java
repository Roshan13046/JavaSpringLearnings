package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> sizes = new ArrayList<>();
        sizes.add("XL");
        sizes.add("M");
        sizes.add("XXL");
        MyImmutableClass myImmutableClass = new MyImmutableClass("Roshan", sizes );

        myImmutableClass.getName();
        System.out.println("Array List size: " + myImmutableClass.getClothSize().size());
        myImmutableClass.getClothSize().add("S");
        myImmutableClass.getClothSize().add("ML");
        myImmutableClass.getClothSize().add("XXXL");
        //This means we are actually not changing the content of the list but just making the changes into the returned copy of it.
        System.out.println("Even after adding the object member variable array list haven't chnage: " + myImmutableClass.getClothSize().size());
    }
}
