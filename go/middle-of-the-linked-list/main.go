// Source: https://leetcode.com/problems/middle-of-the-linked-list/
package middleofthelinkedlist

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

func middleNode(head *ListNode) *ListNode {
	listLength := 0

	// get list length
	n := head
	for n != nil {
		listLength++
		n = n.Next
	}

	// get middle node starting at start
	n = head
	i := 0
	for i < listLength/2 {
		n = n.Next
		i++
	}

	return n
}
