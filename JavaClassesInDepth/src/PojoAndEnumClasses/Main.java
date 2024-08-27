package PojoAndEnumClasses;

public class Main {
    public static void main(String[] args) {
        //Enum Methods commonly used are : values(), ordinal(), valueOf(), name()

        for(WeekEnum day : WeekEnum.values()){
            System.out.println(day.ordinal());
        }

        System.out.println(WeekEnum.valueOf("FRIDAY"));
        WeekEnum weekDay = WeekEnum.valueOf("MONDAY");
        System.out.println(weekDay.name());


        EnumMonths month = EnumMonths.findFestiveMonth("Republic Day");
        System.out.println(month.getVal() + " , " + month.getComment());

        //Method overriding example
        EnumMonths.JANUARY.monthDetails();
        EnumMonths.MARCH.monthDetails();
        EnumMonths.APRIL.monthDetails();

        //Abstract Method in Enums example
        EnumMonths janEnum = EnumMonths.JANUARY;
        janEnum.dummyMethod();
        EnumMonths.FEBRUARY.dummyMethod();

        //Interface methods in Enums example
        EnumMonths.JANUARY.interfaceMethodToUpperCase();
        System.out.println("After Upper case method : " + EnumMonths.JANUARY.getComment());
    }
}
