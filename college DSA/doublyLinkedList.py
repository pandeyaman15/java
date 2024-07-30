class Node :
    def __init__(self, data):
        self.prev = None
        self.data = data
        self.next = None



class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_begin(self, data):
        newNode = Node(data)
        if self.head is None:
            self.head = newNode
            return
        newNode.next = self.head
        self.head.prev = newNode
        self.head = newNode 

    def display(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next
        print('None')



dll = DoublyLinkedList()
dll.insert_at_begin(10)
dll.insert_at_begin(20)
dll.insert_at_begin(30)

dll.display()  
