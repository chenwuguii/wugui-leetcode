package wugui.leetcode.recursion;


/**
 * 反转链表
 *
 * @author chenziyang
 */
public class LeetCode206 {

    /*
    给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     */

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return nextNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
