package ch09;

public class Truck extends Car{

    private int ton;

    public void load() {
        System.out.println("짐을 싣다");
    }
    
    public void offload() {
        stopCar();
        System.out.println("짐을 내리다");
    }

    Truck(String color, String company, String model) {
        super(color, company, model);
    }


}
