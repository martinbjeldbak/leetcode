package mergetwosortedlists

import "fmt"

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

func (n ListNode) String() string {
	x := n.Next
	s := fmt.Sprintf("%v ", n.Val)
	for x != nil {
		s += fmt.Sprintf("%v ", x.Val)
		x = x.Next
	}
	return fmt.Sprintf("[%v]", s)
}

func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	fmt.Printf("--Merging l1: %v with l2: %v--\n", list1, list2)

	if list1 == nil {
		fmt.Println("List 1 nil, dunno")
		list1 = list2
	} else if list2 == nil {
		fmt.Println("List 2 nil, dunno")
	} else {
		list1, rest := insertNode(list1, list2)

		fmt.Printf("Now merged\ncalling mergeTowLists list1: %v\n\t\t      list2: %v\n", list1, rest)
		return mergeTwoLists(list1, rest)
	}

	return list1
}

func insertNode(root *ListNode, node *ListNode) (*ListNode, *ListNode) {
	n := root
	rest := &ListNode{}

	if node.Val < root.Val {
		rest = node.Next
		node.Next = root
		root = node
		return root, rest
	}

	for n != nil {
		if n.Next == nil {
			if node.Val >= n.Val {
				n.Next = node
				n = nil
				rest = nil
			} else {
				rest = node.Next
				node.Next = n
				root = node
				n = nil
			}
			break
		} else if n.Next.Val >= node.Val {
			tmp := n.Next
			n.Next = node
			rest = node.Next
			node.Next = tmp
			break
		}
		n = n.Next
	}

	return root, rest
}
