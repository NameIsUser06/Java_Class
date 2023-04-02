package ch01;

public class ArrayExam02 {
    public static void main(String[] args) { // main + tab
        String[] str = new String[3];
        str[0] = "Hello";
        str[1] = "Java";
        str[2] = "World";

        // iter
        for (String s : str) {
            System.out.println(s);
        }
    }
}
