package ch04;

public class ClassExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Kim";
        s2.name = "Lee";
        s3.name = "Cho";

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
