/*
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode result = new ListNode(head.val);
        ListNode p = result;
        ListNode q = head.next;
        while(q != null) {
            if(q.val == p.val) {
                q = q.next;
            }
            else {
                p.next = new ListNode(q.val);
                q = q.next;
                p = p.next;
            }
        }
        return result;
    }
}
