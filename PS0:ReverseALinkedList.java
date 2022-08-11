// -------------------------------------------------
// PS0: ReverseALinkedList
// -------------------------------------------------

// LINK: https://leetcode.com/problems/reverse-linked-list/
// LINK: https://www.hackerrank.com/challenges/reverse-a-linked-list/problem?isFullScreen=true

// --------------------------------------
// P R O B L E M   S T A T E M E N T 
/* 
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
  
Example 2:
  
Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []
 

Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/


// --------------------------------------
// S O L U T I O N   I N   J A V A 

/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) { // Function to reverse a Linked List, given its head as a parameter to the function.
        if (head == null || head.next == null)  return head;  

        ListNode newHead = reverseList(head.next);
        head.next.next = head; 
        head.next = null;  

     return newHead; // returning the new head after the nodes of the LL have been reversed.
    }
}

// --------------------------------------
