public class insertatbeginning {    
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;   
    public void addAtStart(int data) {   
        Node newNode = new Node(data);   
        if(head == null) {   
            head = tail = newNode;   
            head.previous = null;    
            tail.next = null;  
        }    
        else {   
            head.previous = newNode;  
            newNode.next = head;  
            newNode.previous = null;  
            head = newNode;  
        }  
    }  
    public void display() {    
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }   
        while(current != null) {    
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
        insertatbeginning dList = new insertatbeginning();  
        dList.addAtStart(1);  
        dList.display();   
        dList.addAtStart(2);  
        dList.display();   
        dList.addAtStart(3);  
        dList.display();   
        dList.addAtStart(4);  
        dList.display();  
        dList.addAtStart(5);  
        dList.display();  
    }  
}  