class ListNode {
    int value;
    ListNode next;
    
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class detectLoop {
    public static boolean Loop(ListNode head) {
        if (head == null)
         return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;    
            if (slow == fast) {        
                return true;
            }
        }
        
        return false;   
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; 
        

        boolean ans = Loop(head);
        
        if (ans) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }
}

