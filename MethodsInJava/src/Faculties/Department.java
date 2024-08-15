package Faculties;

public class Department {
    public static Integer id = 1;

    public String getDepartment(String department){
        return "Department is " + department + " code is : " + getDepartmentCode();
    }

    private Integer getDepartmentCode(){
        return ++id;
    }

    protected String getDepartmentHOD(){
        return "Roshan Raut";
    }

    String defaultDepartmentCode(){
        return "Sample ID";
    }
}
