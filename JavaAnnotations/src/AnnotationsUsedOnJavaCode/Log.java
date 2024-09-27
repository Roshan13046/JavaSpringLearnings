package AnnotationsUsedOnJavaCode;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs //this supresses heap pollution warning created for vararg type
    public static void printLogValues(List<Integer>... listOfInteger){
        Object [] objects = listOfInteger;
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Roshan");
        objects[0] = listOfString;
    }
}
