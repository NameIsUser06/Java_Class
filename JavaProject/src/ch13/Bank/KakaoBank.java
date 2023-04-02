package ch13.Bank;

import ch13.Employee;

import java.util.HashMap;

public class KakaoBank implements Bank {

    private static float rate;

    private KakaoBank() {
        account = 2000;
        money = 100000000;
    }

    private static KakaoBank instance = new KakaoBank();
    private static int money;
    private static int account;
    private static HashMap<Integer, Integer> store = new HashMap<>();

    public static KakaoBank getInstance() {
        if (instance == null) instance = new KakaoBank();
        return instance;
    }

    public static float getRate() {
        return rate;
    }

    public static void setRate(float rate) {
        KakaoBank.rate = rate + 2.5f;
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
        if (employee.getGrade() > 4) {
            System.out.println("신용등금이 4등급 이하면 대출이 가능!");
            return 0;
        }
        if (this.money < money) {
            System.out.println("은행 자본금이 부족함");
            return 0;
        }
        this.money -= money;
        System.out.println("카카오뱅크에서 " + money + "원을 대출합니다 금리는 " + rate + "% 입니다." + "연간 이자는 " + money * rate / 100 + "원 입니다");
        return money;
    }
}
