package week01.ch03;

public class TakeExam {
    public static void main(String[] args) {
        Person choi = new Person("choi", 5000);
        Take brown = new Subway(3);
        Take bus7_2 = new Bus("7-2");
        Car myCar = new Car();
        GasStation suyeong = new GasStation("suyeong");

        choi.take(brown);
        choi.take(bus7_2);
        brown.showInfo();
        bus7_2.showInfo();
        choi.showInfo();

        choi.oiling(myCar, 2, suyeong);
        choi.takeCar(myCar, 30);
        choi.showInfo();
        suyeong.showInfo();

    }
}
