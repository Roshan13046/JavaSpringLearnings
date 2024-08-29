package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
    private final String name;
    private final List<Object> clothSize;

    public MyImmutableClass(String name, List<Object> clothSize) {
        this.name = name;
        this.clothSize = clothSize;
    }

    public String getName() {
        return name;
    }

    public List<Object> getClothSize() {
        //this is required bcz making the arrayList final means we cannot point now to a new list, but still can add, delete values in it,
        //so for that reason we send a copy of it
        return new ArrayList<>(clothSize);
    }
}
