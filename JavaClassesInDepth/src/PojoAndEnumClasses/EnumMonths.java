package PojoAndEnumClasses;

public enum EnumMonths {
    JANUARY(1, "january month"),
    FEBRUARY(2, "february month"),
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
