package GenericClassAndMethod;

public class Main {

    public static void main(String[] args) {
        PrintData<Integer>  printObj1 = new PrintData<Integer>();
        printObj1.setPrintValue(1);
        Integer printval = printObj1.getValue();

        if(printval == 1){
            System.out.println(printval);
        }

        PrintData<String> colorPrint = new ColorPrint();
        colorPrint.setPrintValue("Roshan");
        colorPrint.printData("ROSHAN");

//        System.out.println(colorPrint.getValue());

        XeroxBlack<Integer> xeroxBlack = new XeroxBlack<>();
        xeroxBlack.printData(123);

        PrintColorAndXerox<String, Integer> printColorAndXerox = new PrintColorAndXerox<>();
        printColorAndXerox.put("ROSHAN", 123);

        //RAW TYPE OBJECT
        PrintData rawTypePrintObject = new PrintData();
        rawTypePrintObject.printData(" RAW TYPE Roshan");
    }
}
