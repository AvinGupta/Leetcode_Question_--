package Java_Tree;
public class BinaryTree_Client {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        //10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(72));
        System.out.println(bt.ht());
        bt.PreOrder();
        bt.PostOrder();
        bt.InOrder();
        bt.levelOrder();

    }
}
