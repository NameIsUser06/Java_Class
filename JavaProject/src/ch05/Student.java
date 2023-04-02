package ch05;

public class Student {
    String name;
    static String group = "SW";
    final static String school = "Busan Software Meister HighSchool";
    
    void showInfo() {
        System.out.println("이름은 " + name + " 학과는 " + group + "입니다");
    }
}
