
/*
82. 删除排序链表中的重复元素 II
给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5

示例 2:

输入: 1->1->1->2->3
输出: 2->3


*/

public class leetcode_82 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        boolean flag = false;
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        ListNode cur = dummy;
        ListNode out = head;
        while (out.next != null) {
            if (out.val == out.next.val) {
                flag = true;
                out.next = out.next.next;
            } else if (flag == true) {
                cur.next = out.next;
                out=out.next;
                flag = false;
            } else {
                cur = out;
                out=out.next;
            }
        }
        if(flag){
            cur.next = out.next;
        }
        return dummy.next;

    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) {
        String line ="[1,1,1]";

        ListNode head = stringToListNode(line);

        ListNode ret = deleteDuplicates(head);

        String out = listNodeToString(ret);

        System.out.print(out);

    }
}
