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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null; 
        ListNode temp=head;
        ListNode prev=null;         
        while(temp!=null){
            ListNode kth=kNode(temp,k);
            if(kth==null){
                if(prev!=null){
                    prev.next=temp;;
                } 
                break;
            }
            else{
                ListNode nextNode=kth.next;
                
                kth.next=null;
                ListNode newHead=reverseList(temp);
                if(temp==head) head=newHead;
                else{
                    prev.next=kth;
                }
                prev=temp;
                temp=nextNode;
                
                
            }

        }
        return head;
    }

    public ListNode reverseList(ListNode head) {        // the method that reverse the List (iterative approach)
        if(head==null || head.next==null){
            return head;
        }
        ListNode  newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }

    public ListNode kNode(ListNode temp,int k){ // the method that will find the kth Node in the linked list
        while(k>1){
            if(temp==null) return null;
            temp=temp.next;
            k--;
        }
        return temp;
    }
}