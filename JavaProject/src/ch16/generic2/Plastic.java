package ch16.generic2;

public class Plastic implements Material {
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("프린터를 출력합니다.");
    }
}
