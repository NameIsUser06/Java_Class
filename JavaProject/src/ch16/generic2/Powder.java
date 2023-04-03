package ch16.generic2;

public class Powder implements Material {
    @Override
    public String toString() {
        return "재료는 Powder입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더를 출력합니다.");
    }
}