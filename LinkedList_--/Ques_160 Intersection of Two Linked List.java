/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A_pt=headA;
        ListNode B_pt=headB;
        while(A_pt!=B_pt){
            if(A_pt!=null) A_pt=A_pt.next;
            else A_pt=headB;
            if(B_pt!=null) B_pt=B_pt.next;
            else B_pt=headA;
        }
        return A_pt;
    }
}
