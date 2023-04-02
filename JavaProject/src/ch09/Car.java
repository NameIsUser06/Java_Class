package ch09;

public class Car {
    protected String color;
    private String company;
    private String model;
    private int speed;

    Car(String color, String company, String model) {
        this.color = color;
        this.company = company;
        this.model = model;
    }

    public void startCar() {
        if (speed == 0) {
            speedUp();
        }
        return;
    }

     public void speedUp() {
         System.out.println("속도를 올립니다");
         speed += 10;
     }

     public void stopCar() {
        while (speed != 0) {
            speedDown();
        }
        return;
     }

     public void speedDown() {
        if (speed == 0) {
            System.out.println("정지한 상태입니다");
        }
        speed -= 10;
        System.out.println("속도를 내립니다");
     }
     public void showInfo() {
         System.out.println("차 색상은 " + color + " 제조사는 " + company + " 모델명은 " + model + "입니다");
     }

}
