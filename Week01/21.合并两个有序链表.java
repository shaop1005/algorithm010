/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        return fun1(l1, l2);
    }
    
    public ListNode fun (ListNode node1, ListNode node2) {
        ListNode pointer = new ListNode(-1);
        ListNode prev = pointer;
        while(node1 != null && node2 != null) {
            if (node1.val >= node2.val) {
                prev.next = node2;
                node2 = node2.next;
            } else {
                prev.next = node1;
                node1 = node1.next;
            }
            prev = prev.next;
        }
        if (node1 == null) {
            prev.next = node2;
        } else {
            prev.next = node1;
        }
        return pointer.next;
    }
}
// @lc code=end

