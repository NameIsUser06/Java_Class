package ch11;

public class interfaceExam {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        tv.soundUp();
        tv.soundUp();
        tv.showInfo();

        tv.equals(radio);
    }
}
