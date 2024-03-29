package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class ByteStreamExam2 {
    public static void main(String[] args) {
        BufferedInputStream bd = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);

        int a;
        try {
            while ((a = bd.read()) != -1) {
                bo.write(a);
            }
            bo.flush();
        } catch (Exception e) {
        }
    }
}
