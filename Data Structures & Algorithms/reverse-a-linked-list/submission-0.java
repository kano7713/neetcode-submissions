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

//curr.valはint
//curr.nextはListNode(currは箱そのもの)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null; 
        while (curr != null){ //currが今見てるもの
            ListNode nextTemp = curr.next;
            
            curr.next=prev; //今の箱が繋ぐ先（curr.next）に前の箱（prev）をセットする
            prev=curr;
            curr=nextTemp;//次の箱へと移動させる
        }
        return prev;
    }
}
