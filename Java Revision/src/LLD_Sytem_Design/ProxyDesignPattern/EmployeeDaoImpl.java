package LLD_Sytem_Design.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDAO{
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee success");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted employee success");
    }
}
