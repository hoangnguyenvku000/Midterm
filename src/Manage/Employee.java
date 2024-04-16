package Manage;

public class Employee {
    int ID;
    String fullName;
    private String birthDay;
    private int phone;
    private String email;
    private String employeeType;
    private int employeeCount;

    public Employee() {

    }
    
    public Employee(int ID, String fullName, String birthDay, int phone, String email, String employeeType, int employeeCount) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeCount = employeeCount;
        this.employeeType = employeeType;
    }
 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "Employee [ID = " + ID + ", fullName = " + fullName + ", birthDay = " + birthDay + ", phone = " + phone + ", email = " + email + ", employeeType = " + employeeType + ", employeeCount = " + employeeCount + "]";
    }
}
