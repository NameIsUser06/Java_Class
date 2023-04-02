package week03.ex2_queue;

import week02.LinkedList;
import week02.Node;

public class MyQueue extends LinkedList implements IQueue{
    private Node front;
    private Node rear;

    @Override
    public void enQueue(String data) {
        Node newNode;
        if (isEmpty()) {
            front = add(data);
            rear = front;
            return;
        }
        rear.next = add(data);
        rear = rear.next;
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue가 비어있습니다");
            return null;
        }
        String data = remove(0).getData();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue가 비어있습니다");
        }
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.getData() + " ");
            temp = temp.next;
        }
    }
}
