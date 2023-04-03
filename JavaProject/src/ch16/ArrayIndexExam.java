package ch16;

public class ArrayIndexExam {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
