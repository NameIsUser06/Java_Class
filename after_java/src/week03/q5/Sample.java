package week03.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>(Arrays.asList(1, 2, 3)); // a 변수는 주소
        ArrayList<Integer> b = a; // 주소대입
        a.add(4); // a 랑 b는 같은공간을 가리킴
        System.out.println(b.size()); // 4
    }
}

