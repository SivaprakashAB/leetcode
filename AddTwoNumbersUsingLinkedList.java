
// 2. Add Two Numbers
// Solved
// Medium
// Topics
// Companies
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

// Example 1:


// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode newnode = new ListNode(0);  // create a newnode
      ListNode head = newnode;  //to assign the newnode base address to another listnode
      int bal=0;
      while( l1 != null || l2 != null)  // to check the l1 and l2 is not null
      {
        int sum = 0+bal;  // every loop to add the sum
         if(l1!=null)
         {
            sum = sum+l1.val;  // to add the sum addition to the l1 value
            l1 = l1.next;  // to trace the l1 value
         }
         if(l2!=null)
         {
            sum = sum+l2.val;  // to add the sum addition to the l2 value
            l2 = l2.next;  // to trace the l2 value
         }
         bal = sum/10;  //8+2 = 10 then bal = 1  to add this bal to next sum value
         sum = sum%10; // 8+2 = 10 the sum = 0;
         head.next = new ListNode(sum);
         head = head.next;
    }
    if(bal == 1){
        head.next = new ListNode(1);
    }
        return newnode.next;
    }
}
