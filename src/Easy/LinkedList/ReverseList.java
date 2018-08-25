package Easy.LinkedList;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next==null)  return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode t = head;  //走在后面的指针
        ListNode p = t.next; // 走在前面的指针
        ListNode next;      //保存下一个值

        while (p != null) {
            next = p.next;
            p.next = t;
            t = p;
            p = next;
        }

        dummy.next.next = null;
        dummy.next = t;

        p = t;
        while (p != null) {
            System.out.printf(p.val + " ");
            p = p.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
        reverseList.reverseList(head);
    }
}
