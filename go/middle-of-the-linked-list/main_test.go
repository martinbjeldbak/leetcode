// Source: https://leetcode.com/problems/middle-of-the-linked-list/
package middleofthelinkedlist

import (
	"reflect"
	"testing"
)

func makeList(vals []int) *ListNode {
	r := &ListNode{Val: vals[0]}
	n := r

	for i := 1; i < len(vals); i++ {
		next := &ListNode{Val: vals[i]}
		n.Next = next
		n = next
	}

	return r
}

func Test_middleNode(t *testing.T) {
	type args struct {
		head *ListNode
	}
	tests := []struct {
		name string
		args args
		want *ListNode
	}{

		{
			name: "Example 1",
			args: args{head: makeList([]int{1, 2, 3, 4, 5})},
			want: makeList([]int{3, 4, 5}),
		},
		{
			name: "Example 2",
			args: args{head: makeList([]int{1, 2, 3, 4, 5, 6})},
			want: makeList([]int{4, 5, 6}),
		},
		{
			name: "Martin example 1",
			args: args{head: makeList([]int{1})},
			want: makeList([]int{1}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := middleNode(tt.args.head); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("middleNode() = %v, want %v", got, tt.want)
			}
		})
	}
}
