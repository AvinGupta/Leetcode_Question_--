class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class LRUCache {
    HashMap<Integer,Node> map=new HashMap<>();
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int size;
    public LRUCache(int capacity) {
        size=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node temp=map.get(key);
        map.remove(key);
        delete(temp);
        insert(temp);   
        map.put(key,head.next);     
        return temp.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            map.remove(key);
            delete(temp);
        }
        if(map.size()==size){
            map.remove(tail.prev.key);
            delete(tail.prev);
        }
        insert(new Node(key,value));
        map.put(key,head.next);
    }
    public void insert(Node newNode){
        Node temp=head.next;

        newNode.next=temp;
        newNode.prev=head;
        
        head.next=newNode;
        temp.prev=newNode;
    }
    public void delete(Node delNode){
        Node x=delNode.prev;
        Node y=delNode.next;

        x.next=y;
        y.prev=x;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
