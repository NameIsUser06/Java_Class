package ch13;

import ch13.Bank.BankOfKorea;
import ch13.Bank.KakaoBank;
import ch13.Bank.WooriBank;

public class BankExam {
    public static void main(String[] args) {
        // 1. 기준금리 설정
        BankOfKorea bankOfKorea = BankOfKorea.getInstance();
        bankOfKorea.setBaseRate(3.5f);

        System.out.println(bankOfKorea.getBaseRate());
        System.out.println(WooriBank.getRate());
        System.out.println(KakaoBank.getRate());

        WooriBank wooriBank = WooriBank.getInstance();
        KakaoBank kakaoBank = KakaoBank.getInstance();

        Employee choi = new Employee("choi", 1);
        choi.setWooriAccount(wooriBank.makeAccount());
        choi.setKakaoAccount(kakaoBank.makeAccount());
        System.out.println(choi.getWooriAccount());
        System.out.println(choi.getKakaoAccount());

        choi.saving(wooriBank, 5000);
        choi.saving(kakaoBank, 5000);
        choi.saving(wooriBank, 10000);

        choi.showMoney(wooriBank);
        // choi 1000의 계좌 15000원 출력
        choi.showMoney(kakaoBank);

        choi.borrowMoney(wooriBank, 10000);
        choi.showMoney(wooriBank);
        System.out.println(choi.getGrade());
        System.out.println(WooriBank.getMoney());
    }
}
