package LLD_Sytem_Design.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDAO{
    EmployeeDAO employeeDAO;
    String role;

    EmployeeDaoProxy(String role){
        this.role = role;
        employeeDAO = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee(Employee employee) {
        if(role.equals("USER") || role.equals("ADMIN")){
            employeeDAO.addEmployee(employee);
        }else{
            System.out.println("You don't have permission to add the employee");
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        if(role.equals("USER") || role.equals("ADMIN")){
            employeeDAO.deleteEmployee(employee);
        }else{
            System.out.println("You don't have permission to delete any employee");
        }
    }
}
