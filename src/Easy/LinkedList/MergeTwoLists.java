package Easy.LinkedList;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null && l2)

        ListNode head = new ListNode(0);
        ListNode p = head;

        while (l1!=null && l2!=null) {
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            }
            else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1!=null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode head1 = new ListNode(1);
        ListNode l1 = head1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;

        ListNode head2 = new ListNode(1);
        ListNode l2 = head2;
        l2.next = new ListNode(3);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2 = l2.next;

        ListNode result = mergeTwoLists.mergeTwoLists(head1, head2);
        while (result!=null){
            System.out.printf(result.val + " ");
            result = result.next;
        }
    }
}
