package linkedlistcycleii

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

func Test_detectCycle(t *testing.T) {
	head1 := makeList([]int{3, 2, 0, -4})
	head1.Next.Next.Next.Next = head1.Next // make cycle from -4 to 2

	head2 := makeList([]int{1, 2})
	head2.Next.Next = head2 // make cycle from 2 to 1

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
			args: args{head: head1},
			want: head1.Next, // tail connects to node index 1
		},
		{
			name: "Example 2",
			args: args{head: head2},
			want: head2, // tail connects to node index 0
		},
		{
			name: "Example 3",
			args: args{head: makeList([]int{1})},
			want: nil, // no cycle
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := detectCycle(tt.args.head); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("detectCycle() = %v, want %v", got, tt.want)
			}
		})
	}
}
