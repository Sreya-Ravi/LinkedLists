// -------------------------------------------------
// PS0: Multiply2NosGivenAsLLs
// -------------------------------------------------

// LINK: https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2. 

Note: The output could be large take modulo 109+7.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow, the first line of each test case contains an integer N denoting the size of the first linked list (L1). In the next line are the space separated values of the first linked list. The third line of each test case contains an integer M denoting the size of the second linked list (L2). In the forth line are space separated values of the second linked list.

Output:
For each test case output will be an integer denoting the product of the two linked list.

User Task:
The task is to complete the function multiplyTwoLists() which should multiply the given two linked lists and return the result.

Constraints:
1 <= T <= 100
1 <= N, M <= 100

Example:
Input:
2
2
3 2
1
2
3
1 0 0
2
1 0 

Output:
64
1000

Explanation:
Testcase 1: 32*2 = 64.

Testcase 2: 100*10 = 1000.
*/


// --------------------------------------
// S O L U T I O N   I N   J A V A 


/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long n =1000000007;
         long n1=0,n2=0;
         while(l1!=null||l2!=null){
             if(l1!=null){
                 n1=(n1*10)%n+l1.data;
                 l1=l1.next;
             }
             if(l2!=null){
                 n2=(n2*10)%n+l2.data;
                 l2=l2.next;
             }
         }
         return ((n1%n)*(n2%n))%n;

          
   }
}
// --------------------------------------
 
