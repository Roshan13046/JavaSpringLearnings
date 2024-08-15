package MathsCalculation;

public class Sum {

    public Integer sumOfInteger(int a , int b){
        return a + b;
    }

    public Integer sumOfInteger(int a, int b, int c){
        return a + b + c;
    }

    //Similarly we cannot create overload methods for different no of arguments so we use
    //variable arguments concept VARARGS

    public Integer sumOfInteger(int defaultNum, int ...nums){
        int sumOfIntegers = defaultNum;

        for(var integerNums : nums){
            sumOfIntegers += integerNums;
        }

        return sumOfIntegers;
    }
    //there cannot be more than one varargs and they should always be decalred at last of the
    // method arguments
//
//    public Integer sumOfIntergers(int ...nums1, int ...nums2){
//
//    }

//    public Integer sumOfIntegerNums(int ...nums2 , int nums1 ){
//        return 0;
//    }
}
