package week02;

public class LinkedListTest {
    public static void main(String[] args) {
        // 1. LinkedList 생성
        LinkedList list = new LinkedList();
        // 2. 생성된 Linked List에 값 추가
        list.add("A");
        list.add("B");
        list.add("C");
        // 3. LinkedList 의 값 출력
//        list.printAll();

        list.insert("D", 2);
//        list.printAll();

        list.remove(1);
        list.printAll();
        System.out.println();
        System.out.println(list.getElement(1).getData());
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
