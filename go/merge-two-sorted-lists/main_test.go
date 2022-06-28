package mergetwosortedlists

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

func Test_mergeTwoLists(t *testing.T) {
	type args struct {
		list1 *ListNode
		list2 *ListNode
	}
	tests := []struct {
		name string
		args args
		want *ListNode
	}{
		{
			name: "Example 1",
			args: args{list1: makeList([]int{1, 2, 4}), list2: makeList([]int{1, 3, 4})},
			want: makeList([]int{1, 1, 2, 3, 4, 4}),
		},
		{
			name: "Example 2",
			args: args{list1: nil, list2: nil},
			want: nil,
		},
		{
			name: "Example 3",
			args: args{list1: nil, list2: &ListNode{Val: 0}},
			want: makeList([]int{0}),
		},
		{
			name: "Martin Example 1",
			args: args{list1: &ListNode{}, list2: &ListNode{Val: 1}},
			want: makeList([]int{0, 1}),
		},
		{
			name: "Martin Example 2",
			args: args{list1: makeList([]int{2}), list2: makeList([]int{1})},
			want: makeList([]int{1, 2}),
		},
		{
			name: "Martin Example 3",
			args: args{list1: makeList([]int{1, 2, 5}), list2: makeList([]int{1, 2, 8})},
			want: makeList([]int{1, 1, 2, 2, 5, 8}),
		},
		{
			name: "Martin Example 4",
			args: args{list1: &ListNode{Val: 0}, list2: nil},
			want: makeList([]int{0}),
		},
		{
			name: "Martin Example 5",
			args: args{list1: makeList([]int{2}), list2: makeList([]int{1, 3})},
			want: makeList([]int{1, 2, 3}),
		},
		{
			name: "Failed Example 1",
			args: args{list1: makeList([]int{-9, 3}), list2: makeList([]int{5, 7})},
			want: makeList([]int{-9, 3, 5, 7}),
		},
		{
			name: "Failed Example 2",
			args: args{list1: makeList([]int{-2, 5}), list2: makeList([]int{-9, -6, -3, -1, 1, 6})},
			want: makeList([]int{-9, -6, -3, -2, -1, 1, 5, 6}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := mergeTwoLists(tt.args.list1, tt.args.list2); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("mergeTwoLists() = %v, want %v", got, tt.want)
			}
		})
	}
}
