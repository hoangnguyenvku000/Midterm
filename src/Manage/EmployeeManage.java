package Manage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManage implements IEmployee {
    private List<Employee> employees;

    public EmployeeManage() {
        employees = new ArrayList<Employee>();
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    @Override
    public void searchEmployee(String fullName) {
        this.employees.stream().filter(o -> o.fullName.equals(fullName)).findAny().ifPresentOrElse(o -> System.out.println(o.toString()), null);
    }
    
    @Override
    public void showInfo() {
        this.employees.stream().forEach(o -> System.out.println(o.toString()));
    }

    public void saveEmployee() {
        try (FileOutputStream fos = new FileOutputStream("employees.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
 

    public void deleteEmployee(int ID) {
        employees.removeIf(employee -> employee.getID() == ID);
    }
    
    public static void writeEmployeesToFile(List<Employee> employees, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
        public static List<Employee> readEmployeesFromFile(String fileName) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            employees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateEmployee(int ID, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == ID) {
                employees.set(i, updatedEmployee);
                return;
            }
        }
        System.out.println("Employee " + ID + " not found.");
    }

}
  
