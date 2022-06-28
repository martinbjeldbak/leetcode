package reverselinkedlist

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

func Test_reverseList(t *testing.T) {
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
			want: makeList([]int{5, 4, 3, 2, 1}),
		},
		{
			name: "Example 2",
			args: args{head: makeList([]int{1, 2})},
			want: makeList([]int{2, 1}),
		},
		{
			name: "Example 3",
			args: args{head: nil},
			want: nil,
		},
		{
			name: "Failed example 1",
			args: args{head: makeList([]int{1})},
			want: makeList([]int{1}),
		},
		{
			name: "Martin example 2",
			args: args{head: makeList([]int{1, 2})},
			want: makeList([]int{2, 1}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverseList(tt.args.head); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("reverseList() = %v, want %v", got, tt.want)
			}
		})
	}
}
