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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { //method for merging two lists
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                temp.next=new ListNode(list2.val);
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list2==null){
            while(list1!=null){
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            }
        }
        else{
            while(list2!=null){
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            }
        }
        return head.next;
    }

    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //the method that will actually sort eh list
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode mid=mid(head);
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode leftHead=head;

        ListNode left=sortList(leftHead);
        ListNode right=sortList(rightHead);
        return mergeTwoLists(left,right);
         
    }
}