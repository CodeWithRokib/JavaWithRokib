class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    public static ListNode1 findMiddle(ListNode1 head) {
        if (head == null) return null;

        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(ListNode1 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);

        printList(head);
        ListNode1 middle = findMiddle(head);
        System.out.println("Middle Element: " + middle.val);
    }
}
