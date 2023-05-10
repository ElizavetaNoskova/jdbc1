public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Alex", "Panov", "male", 20, 1);
        EmployeeDAO employeeDao = new EmployeeDAOImpl();
        employeeDao.getAllEmployee().forEach(System.out::println);
        Integer employeeId = employeeDao.addEmployee(employee);
        System.out.println(employeeDao.getAllEmployee());
        System.out.println();
        employeeDao.updateEmployee(employee, employeeId);
        employeeDao.deleteEmployee(employee);
        System.out.println(employeeDao.getEmployeeById(5));
    }
}