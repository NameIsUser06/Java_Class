package week03.ex2_queue;

public class MyQueueExam {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");

        myQueue.printAll();
    }
}
