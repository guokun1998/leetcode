/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*
 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        
        ListNode r = new ListNode(0);
        ListNode L = r;
        while(p != null || q != null){
            if(q == null){
                r.next = new ListNode(p.val);
                r = r.next;
                
                p = p.next;
                
            }
            else if(p == null){
                r.next = new ListNode(q.val);
                r = r.next;
                q = q.next;
            }
            else if(p.val <= q.val){
                r.next = new ListNode(p.val);
                r = r.next;
                p = p.next;
            }
            else if(q.val < p.val){
                r.next = new ListNode(q.val);
                r = r.next;
                q = q.next;
            }
        }
        return L.next;
    }
}
