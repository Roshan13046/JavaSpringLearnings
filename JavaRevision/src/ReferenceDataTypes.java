public class ReferenceDataTypes {

    public void classReferenceDataType(){
        Employee emp1 = new Employee();
        emp1.id = 10;
        System.out.println("emp1.id : " + emp1.id);
        Employee emp2 = emp1;
        System.out.println("emp2.id : " + emp2.id);
        Employee emp3 = emp2;
        System.out.println("emp3.id : " + emp3.id);

        emp2.id = 12;
        //Note all of them are pointing to the same address
        System.out.println("emp1.id = " + emp1.id +" , emp2.id = "+emp2.id  + " . emp3.id = "+emp3.id );

        emp3.id = 15;
        //Note all of them are pointing to the same address
        System.out.println("emp1.id = " + emp1.id +" , emp2.id = "+emp2.id  + " . emp3.id = "+emp3.id );
    }

    public void stringReferenceDataType(){
        String s1 = "Hello";
        String s2 = "Hello";
        //Note: s1 and s2 are pointing to the same address present in the constant pool
        //== compare string literal string constant pool address
        //equals compare string values
        System.out.println("s1 == s2 :  " + (s1 == s2)  + " , s1.equals(s2) : " + (s1.equals(s2)));

        String s3 = new String("Hello"); // this object is stored at different heap memory location as we have used new keyword

        System.out.println("s3 == s2 :  " + (s3 == s2)  + " , s3.equals(s2) : " + (s3.equals(s2)));


    }


    public static void main(String[] args) {
        ReferenceDataTypes referenceDataTypes = new ReferenceDataTypes();
        referenceDataTypes.classReferenceDataType();

        referenceDataTypes.stringReferenceDataType();


        int arr[] = new int[1];
        arr[0] = 34;
        System.out.println("arr[0] : " + arr[0]);
        int arr2[][] = new int[4][5]; // int [][]arr2 = new int[4][5]
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.println("i = "+ i + ", j = "+j +" arr[i][j] : "+ arr2[i][j]);
            }
        }
        int [][] arr3 = { {1,2}, {3,4}};
        }

    }






