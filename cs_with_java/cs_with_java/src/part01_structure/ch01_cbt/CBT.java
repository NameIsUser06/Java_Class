package part01_structure.ch01_cbt;

import java.util.LinkedList;
import java.util.Queue;

public class CBT implements CBTInterface{

    MyNode root;
    int count;

    @Override
    public void push(Integer value) {
        MyNode newNode = new MyNode(value);
        if (count == 0) {
            root = newNode;
            count++;
            return;
        }

        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp;
        while (true) {
            temp = queue.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }
        count++;
    }

    @Override
    public Integer pop() {
        if (count == 0) {
            System.out.println("empty");
            return null;
        } else if (count == 1) {
            int n = root.value;
            root = null;
            count = 0;
            return n;
        }
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp = null;
        MyNode before = root;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left != null) {
                before = temp;
                queue.add(temp.left);
            }
            if (temp.right != null) {
                before = temp;
                queue.add(temp.right);
            }
        }

        count--;
        if (before.left.equals(temp)) {
            before.left = null;
        }
        else {
            before.right = null;
        }
        return temp.value;
    }

    @Override
    public MyNode getRoot() {
        return root;
    }

    @Override
    public void bfs(MyNode node) {
        Queue<MyNode> queue = new LinkedList<>();
        if (count == 0) {
            System.out.println("empty");
            return;
        }
        queue.add(node);
        MyNode temp;
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.print(temp.value + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

        }
    }

    @Override
    public void dfs(MyNode node) {
        if (count == 0) {
            System.out.println("empty");
            return;
        }

        if (node != null) {
            dfs(node.left);
            dfs(node.right);
            System.out.print(node.value + " ");
        }
    }
}
