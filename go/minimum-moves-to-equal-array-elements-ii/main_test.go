package minimummovestoequalarrayelementsii

import "testing"

func Test_minMoves2(t *testing.T) {
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
			args: args{nums: []int{1, 2, 3}},
			want: 2,
		},
		{
			name: "Example 2",
			args: args{nums: []int{1, 10, 2, 9}},
			want: 16,
		},
		{
			name: "Martin example 1",
			args: args{nums: []int{9}},
			want: 0,
		},
		{
			name: "Failed example 1",
			args: args{nums: []int{1, 0, 0, 8, 6}},
			want: 14,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minMoves2(tt.args.nums); got != tt.want {
				t.Errorf("minMoves2() = %v, want %v", got, tt.want)
			}
		})
	}
}
