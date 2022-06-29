// https://leetcode.com/problems/linked-list-cycle-ii/
package linkedlistcycleii

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

func detectCycle(head *ListNode) *ListNode {
	nexts := make(map[*ListNode]*ListNode)

	n := head
	for n != nil {
		_, exists := nexts[n]

		if !exists {
			nexts[n] = n.Next
		} else {
			return n
		}

		n = n.Next
	}

	return nil
}
