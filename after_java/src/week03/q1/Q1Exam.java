package week03.q1;

public class Q1Exam {
    public static void main(String[] args) {
        UpgradeCalculator cal =new UpgradeCalculator();
        cal.add(10);
        cal.minus(7);
        System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력
    }
}
