package ch13.Bank;

import ch13.Employee;

import java.util.HashMap;

public class WooriBank implements Bank {
    private static float rate;
    private static int account;
    private static int money;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    private static WooriBank instance = new WooriBank();

    private WooriBank() {
        rate = BankOfKorea.getInstance().getBaseRate() + 2.0f;
        account = 1000;
        money = 100000000;
    }

    public static WooriBank getInstance() {
        if (instance == null) instance = new WooriBank();
        return instance;
    }

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        WooriBank.rate = rate + 2.0f;
    }

    public static int getMoney() {
        return money;
    }

    @Override
    public int makeAccount() {
        return account;
    }

    @Override
    public void saving(int account, int money) {
        if (store.get(account) != null) {
            money += store.get(account);
        }
        store.put(account, money);
    }

    @Override
    public int getAccount(int account) {
        return store.get(account);
    }

    @Override
    public int borrowMoney(Employee employee, int money) {
        if (employee.getGrade() > 3) {
            System.out.println("신용등금이 3등급 이하면 대출이 가능!");
            return 0;
        }
        if (this.money < money) {
            System.out.println("은행 자본금이 부족함");
            return 0;
        }
        this.money -= money;
        System.out.println("우리은행에서 " + money + "원을 대출합니다 금리는 " + rate + "% 입니다." + "연간 이자는 " + money * rate / 100 + "원 입니다");
        return money;
    }
}
