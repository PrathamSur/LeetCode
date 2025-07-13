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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode newHead=reverseList(mid.next);
        ListNode temp1=head;
        ListNode temp2=newHead;

        while(temp2!=null){
            if(temp1.val!=temp2.val) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }

    public ListNode middleNode(ListNode head) { // the method to find the middle of a linked list
        ListNode slow=head;
        ListNode fast=head;
       
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;


    }
    
   public ListNode reverseList(ListNode head) { // iterative reverse method for reversing the linked list
   
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}

}