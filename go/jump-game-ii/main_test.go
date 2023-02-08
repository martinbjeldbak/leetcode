package jumpgameii

import "testing"

func Test_jump(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{
			name: "Example 1",
			args: args{nums: []int{2, 3, 1, 1, 4}},
			want: 2,
		},
		{
			name: "Example 2",
			args: args{nums: []int{2, 3, 0, 1, 4}},
			want: 2,
		},
		{
			name: "Failed example 1",
			args: args{nums: []int{2, 1}},
			want: 1,
		},
		{
			name: "Martin example 1",
			args: args{nums: []int{1}},
			want: 0,
		},
		{
			name: "Failed example 2",
			args: args{nums: []int{1, 2, 1, 1, 1}},
			want: 3,
		},
		{
			name: "Failed example 3",
			args: args{nums: []int{6, 2, 6, 1, 7, 9, 3, 5, 3, 7, 2, 8, 9, 4, 7, 7, 2, 2, 8, 4, 6, 6, 1, 3}},
			want: 4,
		},
		{
			name: "Failed example 4 timeout",
			args: args{nums: []int{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5}},
			want: 5,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := jump(tt.args.nums); got != tt.want {
				t.Errorf("jump() = %v, want %v", got, tt.want)
			}
		})
	}
}
