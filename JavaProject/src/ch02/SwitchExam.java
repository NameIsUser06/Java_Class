package ch02;

public class SwitchExam {
    public static void main(String[] args) {
        int month = 1;
        int day = 31;
        switch (month) {
            case 2:
                day = 28;
            case 4: case 6: case 9: case 11:
                day = 30;
        }

        System.out.println(month + "월은 " + day + "일 까지 입니다");
    }
    
}
