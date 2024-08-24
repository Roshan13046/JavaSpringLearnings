package GenericClasses;

public class ColorPrint<T> extends Print<T>{
    T printLaserFormat;
    ColorPrint(){
        super();
        printLaserFormat = null;
    }
    ColorPrint(T printLaserFormat, T value){
        super(value);
        printLaserFormat = printLaserFormat;

    }
    public T getPrintLaserFormat() {
        return printLaserFormat;
    }

    public void setPrintLaserFormat(T printLaserFormat) {
        this.printLaserFormat = printLaserFormat;
    }


    public static void main(String[] args) {
        Print<String> stringColorPrint = new ColorPrint<>();
        ColorPrint<Integer> integerColorPrint = new ColorPrint<>();

        integerColorPrint.setPrintLaserFormat(24566);
        integerColorPrint.printValue(integerColorPrint.getPrintLaserFormat());
    }
}
