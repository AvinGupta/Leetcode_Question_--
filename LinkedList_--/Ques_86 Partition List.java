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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode dummy=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode temp2=dummy2,curr=head,temp=dummy;
        while(curr!=null){
            if(curr.val<x){
                temp.next=curr;
                temp=temp.next;
            }
            else{
                temp2.next=curr;
                temp2=temp2.next;
            }
            curr=curr.next;
            temp.next=temp2.next=null;
        }
        temp.next=dummy2.next;
        return dummy.next;
    }
}
