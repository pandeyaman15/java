class Node:
    def __init__(self, data):
        self.previous = None
        self.data = data
        self.next = None
class DoublyLinkedList:

    def __init__(self,):
        self.head = None
    
    def InsertAtEnd(self, newNode):
        if self.head is None:
            self.head = newNode
            return 
        currentNode = self.head
        while currentNode.next:
            currentNode = currentNode.next
        temp =currentNode.next

        currentNode.pervoius= temp

    def printDoublyLL(self):

        if self.head is None:
            print("Empty list")
            return 
        currentNode = self.head
        while currentNode.next:
            print(currentNode.data)
            currentNode = currentNode.next

l=[1,2,3,4]
linkedlist = DoublyLinkedList()
for i in range(len(l)):
    node = Node(l[i])
    linkedlist.InsertAtEnd(node)
linkedlist.printDoublyLL()
    
