package part01_structure.ch02_bst;

import java.util.Objects;

public class BST implements BSTInterface {

    MyNode root;
    int count;

    @Override
    public void add(Integer value) {
        MyNode newNode = new MyNode(value);
        if (count == 0) {
            root = newNode;
            count++;
            return;
        }

        MyNode temp = root;
        while (true) {
            if (temp.value < newNode.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                temp = temp.right;
            }
            else {
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;
            }
        }
        count++;
    }

    @Override
    public Integer remove(Integer value) {

        MyNode pre = null;
        MyNode temp = root;

        while (!Objects.equals(value, temp.value)) {
            if (value > temp.value) {
                pre = temp;
                temp = temp.right;
            }
            else {
                pre = temp;
                temp = temp.left;
            }
            if (temp == null) {
                System.out.println("no value");
                return -1;
            }
        }

        if (temp.left == null && temp.right == null) {
            if (temp == root) {
                root = null;
            } else if (pre.right == temp) {
                pre.right = null;
            } else {
                pre.left = null;
            }
        } else if (temp.right == null) {
            if (temp == root) {
                root = temp.left;
            } else if (pre.right == temp) {
                pre.right = temp.left;
            } else {
                pre.left = temp.left;
            }
        } else if (temp.left == null) {
            if (temp == root) {
                root = temp.right;
            } else if (pre.right == temp) {
                pre.right = temp.right;
            } else {
                pre.left = temp.right;
            }
        } else {
            MyNode replacePre = temp;
            MyNode replaceTemp = replacePre.left;
            while (replaceTemp.right != null) {
                replacePre = replaceTemp;
                replaceTemp = replaceTemp.right;
            }

            replacePre.right = replaceTemp.left;
            replaceTemp.left = temp.left;
            replaceTemp.right = temp.right;

            if (temp == root) {
                root = replaceTemp;
            } else if (pre.left == temp) {
                pre.left = replaceTemp;
            } else {
                pre.right = replaceTemp;
            }
        }

        count--;
        return temp.value;
    }

    @Override
    public MyNode getRoot() {
        return root;
    }

    @Override
    public void preOrder(MyNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    @Override
    public void inOrder(MyNode node) {
        if (node != null) {
            preOrder(node.left);
            System.out.print(node.value + " ");
            preOrder(node.right);
        }
    }

    @Override
    public void postOrder(MyNode node) {
        if (node != null) {
            preOrder(node.left);
            preOrder(node.right);
            System.out.print(node.value + " ");
        }
    }
}
