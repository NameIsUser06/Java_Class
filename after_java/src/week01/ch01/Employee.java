package week01.ch01;

public class Employee {

    private static int serialNum = 1000;
    private int employeeId;
    private String name;
    private String department;

    public Employee() {
        this.employeeId = ++serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
