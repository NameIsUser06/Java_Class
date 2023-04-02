package week03.q2;

public class MaxLimitCalculator extends Calculator {
    void add(int val) {
        if (getValue() + val >= 100) {
            setValue(100);
            return;
        }
        setValue(getValue() + val);
    }
}
