package spiralmatrix

import (
	"reflect"
	"testing"
)

func Test_spiralOrder(t *testing.T) {
	type args struct {
		matrix [][]int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Example 1",
			args: args{matrix: [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}},
			want: []int{1, 2, 3, 6, 9, 8, 7, 4, 5},
		},
		{
			name: "Example 2",
			args: args{matrix: [][]int{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}},
			want: []int{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7},
		},
		{
			name: "Martin example 1",
			args: args{matrix: [][]int{{1}, {2}}},
			want: []int{1, 2},
		},
		{
			name: "Martin example 2",
			args: args{matrix: [][]int{{1}}},
			want: []int{1},
		},
		{
			name: "Failed example 1",
			args: args{matrix: [][]int{{1, 2}, {3, 4}}},
			want: []int{1, 2, 4, 3},
		},
		{
			name: "Failed example 2",
			args: args{matrix: [][]int{{1, 11}, {2, 12}, {3, 13}, {4, 14}, {5, 15}, {6, 16}, {7, 17}, {8, 18}, {9, 19}, {10, 20}}},
			want: []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
		},
		{
			name: "Failed example 3",
			args: args{matrix: [][]int{{2, 5, 8}, {4, 0, -1}}},
			want: []int{2, 5, 8, -1, 0, 4},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := spiralOrder(tt.args.matrix); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("spiralOrder() = %v, want %v", got, tt.want)
			}
		})
	}
}
