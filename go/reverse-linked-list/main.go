package reverselinkedlist

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}

	var p1 *ListNode
	p2 := head.Next
	current := head

	for current != nil {
		current.Next = p1

		p1 = current
		current = p2
		if p2 == nil {
			return p1
		}
		if p2.Next != nil {
			p2 = p2.Next
		} else {
			current.Next = p1
			break
		}
	}

	return current
}
