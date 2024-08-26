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
    }
}
