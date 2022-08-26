// -------------------------------------------------
// PS3: DeleteNodesWithHigherValueOnRight
// -------------------------------------------------

// LINK: https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given a singly linked list, remove all the nodes which have a greater value on their right side.

Example 1:
Input: LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.

Example 2:
Input: LinkedList = 10->20->30->40->50->60
Output: 60


Your Task:
The task is to complete the function compute() which should modify the list as required and return the head of the modified linked list. 

Constraints:
1 ≤ size of linked list ≤ 1000
1 ≤ element of linked list ≤ 1000
*/


// --------------------------------------
// S O L U T I O N   I N   J A V A 

  Node compute(Node head){
    
      if(head == null || head.next == null) return head;
      Node nextNode = compute(head.next);

      if(nextNode.data > head.data) return nextNode;
      head.next = nextNode;
      return head;
      
  }
