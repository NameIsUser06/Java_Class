package week03.q6;

public class Calculator {
    Integer value = 0;
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}