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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode findNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthNode=findNode(temp,k);
            if(kthNode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode next=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else{
                prev.next=kthNode;
            }   
            prev=temp;
            temp=next;
        }
        return head;
    }
}
