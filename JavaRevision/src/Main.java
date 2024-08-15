//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();

        dataTypes.printDataTypes();

        //reference data type interface
        SmartWatch mobilePhone = new MobilePhone();
        SmartWatch cameraPhone = new CameraPhone();
        MobilePhone mobilePhone1 = new MobilePhone();
        CameraPhone cameraPhone1 = new CameraPhone();

        //but note interface objects cannot be created
//        SmartWatch smartWatch = new SmartWatch(); //ERROR

        System.out.println(mobilePhone1.UsedAs() );
        System.out.println(mobilePhone.UsedAs());
        System.out.println(cameraPhone1.UsedAs());
        System.out.println(cameraPhone.UsedAs());
    }
}