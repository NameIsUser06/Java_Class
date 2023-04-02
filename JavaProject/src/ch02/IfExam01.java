package ch02;

import java.sql.SQLOutput;

public class IfExam01 {
    public static void main(String[] args) {
        int a = args.length;
        if (a == 0) {
            System.out.println("입력값이 없습니다");
        } else if (a == 1) {
            System.out.println("입력값은 " + args[0] + "입니다");
        } else if (a == 2) {
            System.out.println("입력값은 " + args[0] + ", " + args[1] + "입니다");
        }
        else  {
            System.out.println("입력값을 2단어 아래로 해주세요");
        }
    }
}
