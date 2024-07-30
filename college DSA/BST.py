class Node:
    def __init__(self,key):
        self.left = None
        self.right = None
        self.val = key
    def insert(root,key):
        if root is None:
            return Node(key)
        if key < root.val:
            root.left = insert(root.left,key)
        else:
            root.right = insert(root.right,key)
            return root
        
    def inorder(root):
        if root is None:
            inorder(root,left)
            inorder(root.val, end = ' ')
            inorder(root.right)

    def preorder(root):
        if root is None:
            preorder(root.val, end = ' ')
            preoder(root.left)
            preorder(root.right)

    def postorder(root):
        if root is None:
            postorder(root.left)
            postorder(root.right)
            postorder(root.val, end = ' ')

    root = None
    keys = [10,8,7,6,2,9,1,18,16,15,21]
    for key in keys:
        root  = insert(root,key)
    inorder(root)
    preorder(root)
    postorder(root)
        