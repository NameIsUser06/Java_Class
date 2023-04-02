package ch13.Bank;

public class BankOfKorea {
    private float baseRate;
    private static BankOfKorea instance = new BankOfKorea();

    private BankOfKorea(){}

    public static BankOfKorea getInstance() {
        if (instance == null) instance = new BankOfKorea();
        return instance;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
        WooriBank.setRate(baseRate);
        KakaoBank.setRate(baseRate);
    }
}

