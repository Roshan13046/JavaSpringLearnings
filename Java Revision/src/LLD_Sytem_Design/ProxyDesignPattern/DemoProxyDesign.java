package LLD_Sytem_Design.ProxyDesignPattern;

public class DemoProxyDesign {
    public static void main(String[] args) {
        Employee employee = new Employee("Roshan");
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy("TESTER");
        employeeDaoProxy.addEmployee(employee);

        EmployeeDaoProxy user = new EmployeeDaoProxy("USER");
        user.addEmployee(employee);

    }
}
