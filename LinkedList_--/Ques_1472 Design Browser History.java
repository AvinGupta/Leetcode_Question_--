class Node{
    String val;
    Node next;
    Node prev;
    Node(String val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
    Node(String val,Node next){
        this.val=val;
        this.next=next;
        this.prev=null;
    }
    Node(String val,Node next,Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
}
class BrowserHistory {
    Node head;
    public BrowserHistory(String homepage) {
        head=new Node(homepage);
    }
    public void visit(String url) {
        Node nn=new Node(url);
        head.next=nn;
        nn.prev=head;
        head=head.next;
    }

    public String back(int steps) {
        while (steps!=0 && head.prev!=null) {
            head=head.prev;
            steps--;
        }
        return head.val;
    }
    public String forward(int steps) {
        while(steps!=0 && head.next!=null) {
            head=head.next;
            steps--;
        }
        return head.val;
    }
}
