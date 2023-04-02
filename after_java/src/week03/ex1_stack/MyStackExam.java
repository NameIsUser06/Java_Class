package week03.ex1_stack;

public class MyStackExam {
    public static void main(String[] args) {
    /* 1. 스택 생성
       2. 값 추가 A. B. C
       3. 전체 출력
       4. 삭제
     */
        MyStack myStack = new MyStack();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        myStack.printAll();
        System.out.println(myStack.pop());
    }
}
