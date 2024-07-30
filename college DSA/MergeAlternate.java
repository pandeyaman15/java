class ListNode {
    int value;
    ListNode next;
    
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MergeAlternate {
    
    public static ListNode mergeAlternate(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        boolean toggle = true;
        while (l1 != null || l2 != null) {
            if (toggle && l1 != null) {
                current.next = l1;
                l1 = l1.next;
            } else if (l2 != null) {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
            toggle = !toggle;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return dummy.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.value+" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(100);
        l1.next = new ListNode(300);
        l1.next.next = new ListNode(500);
        l1.next.next.next = new ListNode(700);

        ListNode l2 = new ListNode(101);
        l2.next = new ListNode(301);
        l2.next.next = new ListNode(501);
        l2.next.next.next = new ListNode(701);
        
        ListNode mergedList = mergeAlternate(l1, l2);
        printList(mergedList); 
    }
}

