public class DataTypes {
    char var ;
    byte sampleByte ;
    public void printDataTypes(){
        System.out.println("Char value: "+var);
        System.out.println("Byte default value for class variable only : " + sampleByte);

        byte localByteVariable; //ERROR
//        System.out.println("Default value for local Byte Variable : "+localByteVariable);

        //promotions in java
        byte a = 127, b = 1;
//        byte c = a + b; // error bcz expressions are default converted to integer
        int c = a + b;
        byte k = (byte) (a+b);
        System.out.println("c = a + b "+ c);
        System.out.println("byte k = (byte) (a+b); = "+k);//-128


        //promitons expression it is converted to the higher data type among the variables used
        int d =  19; long e = 19;
        long f = d + e;
        System.out.println("long = int + long = "+f);

    }

}
