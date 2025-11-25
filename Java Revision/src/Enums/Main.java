package Enums;

public class Main {
    public static void main(String[] args) {
        for(Days day: Days.values()){
            System.out.println(day.ordinal());
        }


        System.out.println(Days.valueOf("MONDAY"));
        System.out.println(Days.valueOf("MONDAY").name());
    }
}
