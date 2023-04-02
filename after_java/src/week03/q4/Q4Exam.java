package week03.q4;

import java.util.*;

public class Q4Exam {
    public static void main(String[] args) {
//        int[] data = {1, 3, 5, 7, 9};
//        Calculator cal =new Calculator();
//        int result = cal.avg(data);
//        System.out.println(result);  // 5 출력

        ArrayList<Integer> data =new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal =new Calculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력

    }
}
