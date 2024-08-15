package School;

import Faculties.Department;

public class Classes extends Department{
    public static int incrementer = 0;

    public String getClasses(){
        Department department = new Department();
        System.out.println("Some Classes : " + department.getDepartment("Aerospace") );
        System.out.println("get Department HOD : " + getDepartmentHOD());

//        protected members can only be acces by the classes inside the same package
//        System.out.println("get default departmen code " + department.getDefaultDeparmtentCode());
        return "";
    }

    int getClassRoomNo(){
        return incrementer++;
    }
}
