package PojoAndEnumClasses;

public enum EnumMonths {
    JANUARY(1, "january month"){
        @Override
        public void monthDetails(){
            System.out.println("Jan Month, first month, Republic day");
        }
    },
    FEBRUARY(2, "february month"){
        @Override
        public void monthDetails(){
            System.out.println("Feb Month, Feb month, Shivratri day");
        }
    },
    MARCH(3, "march month"),
    APRIL(4, "april month");

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
