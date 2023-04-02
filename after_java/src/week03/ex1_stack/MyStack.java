package week03.ex1_stack;

import week02.LinkedList;
import week02.Node;

public class MyStack extends LinkedList implements IStack{
    private Node top;

    @Override
    public void push(String data) {
        Node newNode = insert(data, 0);
        if (isEmpty()) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다");
            return null;
        }
        top = top.next;
        String data = remove(0).getData();
        return data;
    }

    @Override
    public void printAll() {
        if (isEmpty()) System.out.println("스택이 비어있습니다");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
