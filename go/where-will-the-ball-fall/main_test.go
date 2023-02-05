package wherewilltheballfall

import (
	"reflect"
	"testing"
)

func Test_findBall(t *testing.T) {
	type args struct {
		grid [][]int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Example 1",
			args: args{grid: [][]int{{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}}},
			want: []int{1, -1, -1, -1, -1},
		},
		{
			name: "Example 2",
			args: args{grid: [][]int{{-1}}},
			want: []int{-1},
		},
		{
			name: "Example 3",
			args: args{grid: [][]int{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}}},
			want: []int{0, 1, 2, 3, 4, -1},
		},
		{
			name: "Martin example 1",
			args: args{grid: [][]int{{1}}},
			want: []int{-1},
		},
		{
			name: "Martin example 2",
			args: args{grid: [][]int{{1, 1}}},
			want: []int{1, -1},
		},
		{
			name: "Martin example 3",
			args: args{grid: [][]int{{}}},
			want: []int{},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findBall(tt.args.grid); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("findBall() = %v, want %v", got, tt.want)
			}
		})
	}
}
