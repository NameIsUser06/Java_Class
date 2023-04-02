package ch09;

public class Taxi extends Car{

    private int meter;

    Taxi(String color, String company, String model) {
        super(color, company, model);
    }

    public void startMeter() {
        color = "Silver";
        System.out.println("미터기를 올립니다");
        System.out.println("택시가 출발합니다");
        startCar();
    }

    public void stopMeter() {
        stopCar();
        System.out.println("미터기를 정지합니다");
    }
}
