public class bstdeletion {
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }   
      public Node root;  
  
      public bstdeletion(){  
          root = null;  
      }  
      public void insert(int data) {    
          Node newNode = new Node(data);   
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {   
              Node current = root, parent = null;  
  
              while(root!=null) {    
                  parent = current;  
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
      public Node minNode(Node root) {  
        if (root.left != null)  
            return minNode(root.left);  
        else  
            return root;  
    }
    public Node deleteNode(Node node, int value) {  
        if(node == null){  
            return null;  
         }  
        else {    
            if(value < node.data)  
                node.left = deleteNode(node.left, value);   
            else if(value > node.data)  
                node.right = deleteNode(node.right, value);   
            else {   
                if(node.left == null && node.right == null)  
                    node = null;   
                else if(node.left == null) {  
                    node = node.right;  
                }   
                else if(node.right == null) {  
                    node = node.left;  
                }  
                else {  
                    Node temp = minNode(node.right);  
                    node.data = temp.data;    
                    node.right = deleteNode(node.right, temp.data);  
                }  
            }  
            return node;  
        }  
    }    
      public void inorderTraversal(Node node) {  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " " );  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      } 
      public void preorderTraversal(Node node) {  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
         }  
        else {  

            if(node.left!= null)  
            System.out.print(node.data + " ");
                inorderTraversal(node.left);  
             
            if(node.right!= null)  
                inorderTraversal(node.right);  

        }  
    } 
    public void PostorderTraversal(Node node) {  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
         }  
        else {  

            if(node.left!= null)  
                inorderTraversal(node.left);  
            if(node.right!= null)  
                inorderTraversal(node.right);  
            System.out.print(node.data + " ");

        }  
    } 
      public static void main(String[] args) {  
  
          bstdeletion bt = new bstdeletion();   
          bt.insert(14);  
          bt.insert(5);  
          bt.insert(20);  
          bt.insert(3);  
          bt.insert(6);  
          bt.insert(18); 
          bt.insert(21);
          bt.insert(1);
          bt.insert(7);
          System.out.println("Binary search tree after insertion");  
          bt.inorderTraversal(bt.root); 
        Node delnode= null; 
        System.out.println("Binary search tree after deletion"); 
        delnode = bt.deleteNode(bt.root, 14);  
        bt.inorderTraversal(bt.root);   
          
      }  
}   
