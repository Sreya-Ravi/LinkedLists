// -------------------------------------------------
// PS1: MergePointOf2LinkedLists
// -------------------------------------------------

// LINK: https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
// LINK: https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?isFullScreen=true

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given pointers to the head nodes of  linked lists that merge together at some point, 
find the node where the two lists merge. The merge point is where both lists point to the same node,
i.e. they reference the same memory location. It is guaranteed that the two head nodes will be different,
and neither will be NULL. If the lists share a common node, return that node's value.

Note: After the merge point, both lists will share the same node pointers.

Example : In the diagram below, the two lists converge at Node x:

[List #1] a--->b--->c
                     \
                      x--->y--->z--->NULL
                     /
     [List #2] p--->q
     
Function Description : Complete the findMergeNode function in the editor below.

findMergeNode has the following parameters:
SinglyLinkedListNode pointer head1: a reference to the head of the first list
SinglyLinkedListNode pointer head2: a reference to the head of the second list
Returns int: the data value of the node where the lists merge

Constraints: 
The lists will merge.
head1!=head2!= NULL


Sample Input:
Test Case 0 :

 1
  \
   2--->3--->NULL
  /
 1
 
Test Case 1 :

1--->2
      \
       3--->Null
      /
     1
     
     
Sample Output:
2
3

Explanation:

Test Case 0: As demonstrated in the diagram above, the merge node's data field contains the integer 2.
Test Case 1: As demonstrated in the diagram above, the merge node's data field contains the integer 3.


// --------------------------------------
// S O L U T I O N   I N   J A V A 

  /* For your reference:
   *
   * SinglyLinkedListNode {
   *     int data;
   *     SinglyLinkedListNode next;
   * }
   */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2= head2;
        int l1=0,l2=0;
      
        while(temp1!=null || temp2!=null){ //Finding length of LL1 and LL2
            if(temp1!=null) {
                temp1=temp1.next;
                l1++;
            }
            if(temp2!=null) {
                temp2=temp2.next;
                l2++;
            }
        }
      
        temp1=head1;
        temp2= head2;
      
        while(l1>l2){ //If len(LL1) > len(LL2) then traverse LL1 till the position, from where its remaining length = len(LL2)
            temp1=temp1.next;
            l1--;
        }
      
        while(l2>l1){ //If len(LL2)>len(LL1) then traverse LL2 till the position, from where its remaining length = len(LL1)
            temp2=temp2.next;
            l2--;
        }
      
        while(temp1!=temp2){ //Now the len(LL1)==len(LL2), so traverse both LLs simultaneously to find the merge point :(LL1.data==LL2.data)
            if(temp1.next == temp2.next){ 
                return temp1.next.data;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        if(temp1==temp2) return temp1.data;
        return 0;

    }

// --------------------------------------
