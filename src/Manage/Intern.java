package Manage;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
        super();
    }

    public Intern(int ID, String fullName, String birthDay, int phone, String email, String employeeType, int employeeCount, String majors, int semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern [Majors=" + majors + ", Semester=" + semester + ", University_name=" + universityName + ", " + super.toString() + "]";
    }
}
