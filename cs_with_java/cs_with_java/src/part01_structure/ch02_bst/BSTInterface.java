package part01_structure.ch02_bst;

public interface BSTInterface {
    void add(Integer value);
    Integer remove(Integer value);
    MyNode getRoot();
    void preOrder(MyNode node);
    void inOrder(MyNode node);
    void postOrder(MyNode node);
}
