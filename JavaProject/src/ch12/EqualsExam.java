package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        Student s1 = new Student("Cho", 16);
        Student s2 = new Student("Cho", 16);
        System.out.println(s1.equals(s2));

        String str1 = "busan";
        String str2 = "busan";
        System.out.println(str1.equals(str2));

        String str3 = new String("SoftWare");
        String str4 = new String("SoftWare");
        System.out.println(str3.equals(str4));

    }
}
