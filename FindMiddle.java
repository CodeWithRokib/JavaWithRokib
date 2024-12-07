public class FindMiddle {
    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = findMiddle(head);
        System.out.println("Middle Node: " + (middle != null ? middle.data : "null"));
    }
}
