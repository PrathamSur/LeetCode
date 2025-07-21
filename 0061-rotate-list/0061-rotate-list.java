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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k%len==0 || k==0) return head;
        tail.next=head;
        int newK=k%len;
        ListNode temp=head;
        int count=1;
        while(count!=len-newK){
            temp=temp.next;
            count++;
        }
        head=temp.next;
        temp.next=null;
        return head;

    }
}