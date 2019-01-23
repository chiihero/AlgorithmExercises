
/*
83. 删除排序链表中的重复元素
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
示例 1:
输入: 1->1->2
输出: 1->2

示例 2:
输入: 1->1->2->3->3
输出: 1->2->3
*/

public class leetcode_83 {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null||head.next==null)
            return head;
        ListNode out = head;
        while (out.next != null) {
            if (out.val==out.next.val) {
                out.next = out.next.next;
            }else{
                out=out.next;
            }
        }

        return head;

    }

    public static void main(String[] args) {

    }
}
