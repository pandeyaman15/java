public class searchbst {
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
  
      public searchbst(){  
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
    //   public void inorderTraversal(Node node) {  
    //       if(root == null){  
    //           System.out.println("Tree is empty");  
    //           return;  
    //        }  
    //       else {  
  
    //           if(node.left!= null)  
    //               inorderTraversal(node.left);  
    //           System.out.print(node.data );  
    //           if(node.right!= null)  
    //               inorderTraversal(node.right);  
  
    //       }  
    //   } 
      public static void main(String[] args) {  
  
        BST bt = new BST();   
        bt.insert(10);  
        bt.insert(2);  
        bt.insert(5);  
        bt.insert(8);  
        bt.insert(17);  
        bt.insert(20); 
        bt.insert(15);
        bt.insert(25);
        
        //int target=5;
    //     if(bt.insert==target){
    //         System.out.println("Found");
    //     }
    //     else{
    //         System.out.println("Not Found");
    //     }
    // }
} 
}
