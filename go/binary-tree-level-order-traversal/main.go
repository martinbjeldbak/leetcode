package binarytreelevelordertraversal

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

func levelOrder(root *TreeNode) [][]int {
	return levelNodes(0, make([][]int, 0), root)
}

func levelNodes(currentLevel int, values [][]int, node *TreeNode) [][]int {
	if node == nil {
		return values
	}

	if currentLevel >= len(values) {
		values = append(values, make([]int, 0))
	}

	values[currentLevel] = append(values[currentLevel], node.Val)

	if node.Left != nil {
		values = levelNodes(currentLevel+1, values, node.Left)
	}
	if node.Right != nil {
		values = levelNodes(currentLevel+1, values, node.Right)
	}

	return values
}
