/*
203. 移除链表元素
删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5


*/

public class leetcode_203 {
      public ListNode removeElements(leetcode_82.ListNode head, int val) {
            while(head!=null&&head.val==val){
                  head = head.next;
              }
            if(head==null)return null;
            ListNode begin = head;
            while (head.next!=null) {
                  if (head.next.val==val) {
                        head.next=head.next.next;
                  }else{
                        head=head.next;
                  }
            }
            return begin;
      }
}
