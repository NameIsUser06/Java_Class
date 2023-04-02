package week03.q6;

public class Q6Exam {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
