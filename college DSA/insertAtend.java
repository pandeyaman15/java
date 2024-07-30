public class insertAtend {    
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;  
    public void addAtEnd(int data) {   
        Node newNode = new Node(data);   
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;   
            tail.next = null;  
        }    
        else {    
            tail.next = newNode;   
            newNode.previous = tail;    
            tail = newNode;  
            tail.next = null;  
        }  
    }    
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding a node to end  list ");  
        while(current != null) {   
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
    public static void main(String[] args) {  
        insertAtend dList = new insertAtend();    
        dList.addAtEnd(10);  
        dList.display();   
        dList.addAtEnd(20);  
        dList.display();   
        dList.addAtEnd(30);  
        dList.display();   
        dList.addAtEnd(40);  
        dList.display();   
    }  
}  
