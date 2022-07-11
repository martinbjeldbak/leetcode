package binarytreerightsideview

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func rightSideView(root *TreeNode) []int {
	return rightSideViewRec(root, 0, make([]int, 0))
}

func rightSideViewRec(root *TreeNode, currentDepth int, vs []int) []int {
	if root == nil {
		return vs
	}

	if currentDepth == len(vs) {
		vs = append(vs, root.Val)
	}

	vs = rightSideViewRec(root.Right, currentDepth+1, vs)
	vs = rightSideViewRec(root.Left, currentDepth+1, vs)

	return vs
}
