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
    
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middleNode(head);
        ListNode headB=mid.next;
        mid.next=null;

        ListNode A=sortList(head);
        ListNode B=sortList(headB);
        return mergeTwoLists(A,B);
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln=new ListNode();
        ListNode temp=ln;
        while(list1!=null && list2!= null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1==null) temp.next=list2;
        if(list2==null) temp.next=list1;
        return ln.next;
    }
}
