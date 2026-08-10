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
       ListNode fast=head;
       ListNode slow=head;
       while(fast.next!=null&& fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode secondHalf=reverse(slow.next);
       ListNode firstHalf=head;
       while(secondHalf!=null){
        if(firstHalf.val!=secondHalf.val){
            return false;
        }
        firstHalf=firstHalf.next;
        secondHalf=secondHalf.next;
       }
       return true;
    }
       private ListNode reverse(ListNode head){
        ListNode newHead=head;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;
        }
        return prev;
       }
}