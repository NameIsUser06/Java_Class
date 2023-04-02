package week03.q3;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int value) {
        if (value % 2 == 0) return false;
        return true;
    }
}
