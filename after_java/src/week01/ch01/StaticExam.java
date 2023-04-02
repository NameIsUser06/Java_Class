package week01.ch01;

public class StaticExam {
    public static void main(String[] args) {
        Employee choi = new Employee();
        System.out.println(choi.getEmployeeId());

        Employee kim = new Employee();
        System.out.println(kim.getEmployeeId());

        System.out.println(Employee.getSerialNum());

    }
}
