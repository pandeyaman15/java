class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def search_bst(root, target):
    if root is None:
        return False
    if root.value == target:
        return True
    if target < root.value:
        return search_bst(root.left, target)
    else:
        return search_bst(root.right, target)

# Example usage:
root = Node(5)
root.left = Node(2)
root.right = Node(8)
root.left.left = Node(1)
root.left.right = Node(3)
root.right.left = Node(6)
root.right.right = Node(9)

target = 3
if search_bst(root, target):
    print(f"Found {target} in the BST!")
else:
    print(f"{target} not found in the BST!")