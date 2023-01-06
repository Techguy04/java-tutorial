public class student extends person{
    private String department;
    private String mathNo;
    private int level;

    public student(long id, String firstName, String lastName, String department, String mathNo, int level) {
        super(id, firstName, lastName);
        this.department = department;
        this.mathNo = mathNo;
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMathNo() {
        return mathNo;
    }

    public void setMathNo(String mathNo) {
        this.mathNo = mathNo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return myOutput() +
                "department='" + department + '\'' +
                ", mathNo='" + mathNo + '\'' +
                ", level=" + level +
                '}';
    }
}
