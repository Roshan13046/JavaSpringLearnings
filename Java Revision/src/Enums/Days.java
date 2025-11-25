package Enums;

public enum Days {
    MONDAY(101,"1st Day of week"){
        @Override
        public void dummyMethod(){
            System.out.println("MONDAY Dummy Method");
        }

        public void abstractMethod(){
            System.out.println("MONDAY abstract method");
        }

    },
    TUESDAY(102,"2nd Day of week"){
        public void abstractMethod(){
            System.out.println("TUESDAY abstract method");
        }
    };

    private int val;
    private String comment;

    Days(int val, String comment){
        val = val;
        comment = comment;
    }

    public int getVal(){
        return val;
    }

    public String getComment(){
        return comment;
    }

    public static Days getEnumFromValue(int val){
        for(Days day : Days.values()){
            if(day.val == val){
                return day;
            }
        }

        return null;
    }

    public void dummyMethod(){
        System.out.println("Dummy Method");
    }

    public abstract void abstractMethod();

    public static void main(String[] args) {
//        Days days = Days.getEnumFromValue(101);
//        System.out.println(days.getComment());

        Days.MONDAY.dummyMethod();
        Days.MONDAY.abstractMethod();
        Days.TUESDAY.dummyMethod();
        Days.TUESDAY.abstractMethod();
    }
}
