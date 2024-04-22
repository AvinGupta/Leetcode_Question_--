/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/ 

class Solution {
    public static void insertNode(Node head){
        Node temp=head;
        while(temp!=null){
            Node nn=new Node(temp.val);
            nn.next=temp.next;
            temp.next=nn;
            temp=temp.next.next;
        }
    }
    public static void copyRandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node nn=temp.next;
            if(temp.random!=null){
                nn.random=temp.random.next;
            }
            else{
                nn.random=null;
            }
            temp=temp.next.next;
        }
    }
    public static Node seperate(Node head){
        Node temp=head;
        Node dummy=new Node(-1);
        Node res=dummy;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        insertNode(head);
        copyRandom(head);
        return seperate(head);
    }
}
