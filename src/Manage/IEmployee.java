package Manage;

public interface IEmployee {
    void addEmployee(Employee employee);

    void searchEmployee(String fullName);
    
    void showInfo();

    void updateEmployee(int ID, Employee updatedEmployee);

    void deleteEmployee(int ID);
}
