# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class OddEvenLinkedList(object):
    def oddEvenList(self, head: ListNode):
        if head is None:
            return head
        temp_head = head.next
        current_node = head
        temp_current_node = temp_head
        while temp_current_node is not None and temp_current_node.next is not None:
            current_node.next = temp_current_node.next
            if current_node.next.next is not None:
                temp_current_node.next = current_node.next.next
            else:
                temp_current_node.next = None
            current_node = current_node.next
            if temp_current_node.next is not None:
                temp_current_node = temp_current_node.next
        current_node.next = temp_head

        while head is not None:
            print(head.val)
            head = head.next

exp = OddEvenLinkedList()
element5 = ListNode(6, None)
element4 = ListNode(5, element5)
element3 = ListNode(4, element4)
element2 = ListNode(3, element3)
element1 = ListNode(2, element2)
head = ListNode(1, element1)
head = ListNode(1, None)
exp.oddEvenList(head)


class ReverseLinkedList(object):
    def reverseList(self, head:ListNode):
        result = None
        current = head
        while current is not None:
            temp = current.next
            current.next = result
            result = current
            current = temp
        return result



exp2 = ReverseLinkedList()
element5 = ListNode(6, None)
element4 = ListNode(5, element5)
element3 = ListNode(4, element4)
element2 = ListNode(3, element3)
element1 = ListNode(2, element2)
head = ListNode(1, element1)
exp2.reverseList(head)
