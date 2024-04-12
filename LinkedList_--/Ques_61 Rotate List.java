/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode find(ListNode head,int k){
        int cnt=1;
        while(head!=null){
            if(cnt==k) return head;
            cnt++;
            head=head.next;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode tail=head;
        int cnt=1;
        while(tail.next!=null){
            cnt++;
            tail=tail.next;
        }
        if(k%cnt==0) return head;
        k=k%cnt;
        tail.next=head;
        ListNode temp=find(head,cnt-k);
        head=temp.next;
        temp.next=null;
        return head;
    }
}
