package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car k3 = new Car("white", "Kia", "K3");

        k3.showInfo();
        k3.startCar();
        k3.speedUp();
        k3.stopCar();

        Taxi taxi = new Taxi("Black", "Tesla", "model.3");
        taxi.startMeter();
        taxi.stopMeter();

        Truck truck = new Truck("Blue", "Hyundai", "Bongo");

        truck.load();
        truck.offload();
    }
}
