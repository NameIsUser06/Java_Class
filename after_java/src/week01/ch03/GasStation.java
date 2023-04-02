package week01.ch03;

public class GasStation {

    private String address;
    private int gasAccount;
    private int money;

    public GasStation(String address) {
        this.address = address;
        gasAccount = 100;
    }

    public int oiling(Car myCar, int liter) {
        this.gasAccount -= liter;
        myCar.setLiter(liter);
        this.money += 1600 * liter;
        return 1600 * liter;
    }

    public void showInfo() {
        System.out.println(address + "지점의 기름 총 량은 " + gasAccount + "이고 수입은 " + money + "원 입니다.");
    }
}
