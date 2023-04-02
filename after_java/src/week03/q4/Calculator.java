package week03.q4;

import java.util.ArrayList;

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

    int avg(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return avg / arr.length;
    }
    int avg(ArrayList<Integer> arrayList) {
        int avg = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            avg += arrayList.get(i);
        }
        return avg / arrayList.size();
    }
}

