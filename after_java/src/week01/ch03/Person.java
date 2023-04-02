package week01.ch03;

public class Person {
    private String name;
    private int money = 5000;
    private boolean transfer;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        transfer = false;
    }

    public void showInfo() {
        System.out.println(name + "의 잔돈은 " + money + "원 입니다.");
    }

    public void takeSubway(Subway subway) {
        if (this.money < 1300) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        subway.take(1300);
        this.money -= 1300;
        this.transfer = true;
    }

    public void takeBus(Bus bus) {
        if (transfer != true) {
            return;
        }
        if (this.money < 200) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        bus.take(200);
        this.money -= 200;


    }

    public void take(Take take) {
        if (take instanceof Subway) {
            takeSubway((Subway) take);
        }
        else if (take instanceof Bus) {
            takeBus((Bus) take);
        }
    }

    public void takeCar(Car car, int km) {
        if (car.getLiter() == 0) {
            System.out.println("기름이 없습니다");
            return;
        }
        if (km - car.getLiter() * 15 == 0) {
            System.out.println("주행 완료");
        } else if (km - car.getLiter() * 15 > 0) {
            System.out.println("도착지까지 기름이 부족합니다");
        }
        else {
            car.setLiter(km / 15 + 1);
        }

    }

    public void oiling(Car myCar, int liter, GasStation suyeong) {
        this.money -= suyeong.oiling(myCar, liter);
    }
}
