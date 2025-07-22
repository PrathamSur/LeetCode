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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode next=null;
        while(temp.next!=null){
            if(temp.val==val){
                next=temp.next;
                temp.next=null;
                temp=next;
                head=temp;
                continue;
            }
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        if(head.val==val) return null;
        return head;
    }
}