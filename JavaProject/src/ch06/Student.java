package ch06;

public class Student {
    String name;
    int num;
    String gender;

    Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    Student(String name, int num, String gender) {
        this(name, gender);
        this.num = num;
    }

    void study() {
        System.out.println("공부하기");
    }

    void sleeping() {
        System.out.println("잠자기");
    }

    void morning() {
        System.out.println("아침운동");
    }

    void showInfo() {
        System.out.println("제 이름은 " + name + " 학번은 " + num + "이고 성별은 " + gender + "입니다.");
    }
}