package GenericClasses;

public class RawType<T> {
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        RawType rawType = new RawType();
//      HERE we can set anytype of dataType for single object
        rawType.setData("Hello Raw type");
        rawType.setData(23);
        rawType.setData(Boolean.TRUE);

// Here we are restricted to use only integer type and we have to create different data type object for other data type
        RawType<Integer> intObj = new RawType<>();
        intObj.setData(23);
    }
}
