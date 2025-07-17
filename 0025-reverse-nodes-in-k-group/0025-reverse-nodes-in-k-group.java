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
        ListNode prev=null;          // use the prev node so that after reversing the second group you can attach the prev node to the newHead after its reverse
        while(temp!=null){
            ListNode kth=kNode(temp,k);
            if(kth==null){
                if(prev!=null){
                    prev.next=temp;;
                } 
                break;
            }
            else{
                ListNode nextNode=kth.next; //keep the nextNode in record so that you can make it temp later
                
                kth.next=null;
                ListNode newHead=reverseList(temp);
                if(temp==head) head=newHead;  // if it is the first group then temp will be same as head...then you just have to make the head=newHead
                else{
                    // if temp is not the head it means it is not the first grooup so after the reverse just attach the prev (which is the last node of 
                    //the prev group to the newHead of the reversed next group)
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