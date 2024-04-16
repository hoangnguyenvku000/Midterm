package Manage;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(int ID, String fullName, String birthDay, int phone, String email, String employeeType, int employeeCount, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience [ExpInYear=" + expInYear + ", ProSkill=" + proSkill + ", " + super.toString() + "]";
    }
}
