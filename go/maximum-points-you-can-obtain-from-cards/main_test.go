package main

import "testing"

func Test_maxScore(t *testing.T) {
	type args struct {
		cardPoints []int
		k          int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{
			name: "Example 1",
			args: args{cardPoints: []int{1, 2, 3, 4, 5, 6, 1}, k: 3},
			want: 12,
		},
		{
			name: "Example 2",
			args: args{cardPoints: []int{2, 2, 2}, k: 2},
			want: 4,
		},
		{
			name: "Example 3",
			args: args{cardPoints: []int{9, 7, 7, 9, 7, 7, 9}, k: 7},
			want: 55,
		},
		{
			name: "Timeout example 1",
			args: args{cardPoints: []int{53, 14, 91, 35, 51, 9, 80, 27, 6, 15, 77, 86, 34, 62, 55, 45, 91, 45, 23, 75, 66, 42, 62, 13, 34, 18, 89, 67, 93, 83, 100, 14, 92, 73, 48, 2, 47, 93, 99, 100, 88, 84, 48}, k: 43},
			want: 2,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxScore(tt.args.cardPoints, tt.args.k); got != tt.want {
				t.Errorf("maxScore() = %v, want %v", got, tt.want)
			}
		})
	}
}
