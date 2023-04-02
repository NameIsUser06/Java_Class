package ch13;

import ch13.Bank.KakaoBank;
import ch13.Bank.WooriBank;

public class Employee {

    private String name;
    private int kakaoAccount;
    private int wooriAccount;
    private int grade;

    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setWooriAccount(int makeAccount) {
        this.wooriAccount = makeAccount;
    }
    public void setKakaoAccount(int makeAccount) {
        this.kakaoAccount = makeAccount;
    }

    public int getKakaoAccount() {
        return kakaoAccount;
    }

    public int getWooriAccount() {
        return wooriAccount;
    }

    public void saving(Object obj, int money) {
        if (obj instanceof KakaoBank) {
            ((KakaoBank) obj).saving(kakaoAccount, money);
        }
        else if (obj instanceof WooriBank) {
            ((WooriBank) obj).saving(wooriAccount, money);
        }
    }

    public void showMoney(Object obj) {
        if (obj instanceof KakaoBank) {
            System.out.println(name + "님의 " + kakaoAccount + " 예금현황 : " + ((KakaoBank) obj).getAccount(kakaoAccount));
        }
        else if (obj instanceof WooriBank) {
            System.out.println(name + "님의 " + wooriAccount + " 예금현황 : " + ((WooriBank) obj).getAccount(wooriAccount));
        }
    }

    public void borrowMoney(Object obj, int money) {
        if (obj instanceof WooriBank) {
            int borrow = ((WooriBank) obj).borrowMoney(this, money);
            ((WooriBank) obj).saving(wooriAccount, borrow);
            this.grade++;
        }
        else if (obj instanceof KakaoBank) {
            int borrow = ((KakaoBank) obj).borrowMoney(this, money);
            ((KakaoBank) obj).saving(kakaoAccount, borrow);
            this.grade++;
        }

    }

    public int getGrade() {
        return grade;
    }
}
