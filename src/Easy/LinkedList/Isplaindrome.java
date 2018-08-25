package Easy.LinkedList;

import java.util.Stack;

public class Isplaindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // 若是奇数链表就跳过中间的
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val != stack.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }
}
