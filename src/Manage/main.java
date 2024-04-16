package Manage;

import java.util.List;

public class main {
    public static void main(String[] args) {
        EmployeeManage employeeManager = new EmployeeManage();
        Employee firstEmployee = new Employee(01, "John", "16-4-2005", 123456789, "john@vku.com", "Normal", 1);
        employeeManager.addEmployee(firstEmployee);
        employeeManager.searchEmployee("John");
        String fileName = "C:\\Users\\ADMIN\\Desktop";
        List<Employee> employees = employeeManager.getEmployees();
        employeeManager.writeEmployeesToFile(employees, fileName);
    }
}
