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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr=new ListNode[k];
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int base=len/k;
        int remainder=len%k;
        curr=head;
        for(int i=0;i<k;i++){
            arr[i]=curr;
            for(int j=0;j<base+(i<remainder?1:0)-1;j++){
                curr=curr.next;
            }
            if(curr!=null){
                ListNode next=curr.next;
                curr.next=null;
                curr=next;
            }
        }
        return arr;
    }
}
