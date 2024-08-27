package PojoAndEnumClasses;

public enum EnumMonths implements StringManipulationInterface {
    JANUARY(1, "january month"){
        @Override
        public void monthDetails(){
            System.out.println("Jan Month, first month, Republic day");
        }

        @Override
        public void dummyMethod() {
            System.out.println("January dummy abstract method definition");
        }
    },
    FEBRUARY(2, "february month"){
        @Override
        public void monthDetails(){
            System.out.println("Feb Month, Feb month, Shivratri day");
        }

        @Override
        public void dummyMethod() {
            System.out.println("February dummy abstract method definition");
        }

    },
    MARCH(3, "march month"){
        @Override
        public void dummyMethod() {
            System.out.println("March dummy abstract method definition");
        }
    },

    APRIL(4, "april month"){
        @Override
        public void dummyMethod() {
            System.out.println("April dummy abstract method definition");
        }
    };

    private int val;
    private String comment;

    EnumMonths(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    //method belonging to each constant present in the ENUM class
    public void monthDetails(){
        System.out.println("Default monthDetails method called");
    }

    //abstract methods in enum
    public abstract void dummyMethod();

    //Interface methods defination in enum
    @Override
    public void interfaceMethodToUpperCase() {
        this.comment =  this.getComment().toUpperCase();
    }

    //method belonging to ENUM class
    public static EnumMonths findFestiveMonth(String festival){
        if(festival.equals("Republic Day")){
            for(EnumMonths enumMonths : EnumMonths.values()){
                if(enumMonths.getVal() == 1){
                    return enumMonths;
                }
            }
        }
        return null;
    }

}
