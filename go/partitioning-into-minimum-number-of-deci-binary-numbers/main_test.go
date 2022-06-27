package main

import "testing"

func Test_minPartitions(t *testing.T) {
	type args struct {
		n string
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{
			name: "Example 1",
			args: args{n: "32"},
			want: 3, // 10 + 11 + 11 = 32
		},
		{
			name: "Example 2",
			args: args{n: "82734"},
			want: 8,
		},
		{
			name: "Example 3",
			args: args{n: "27346209830709182346"},
			want: 9,
		},
		{
			name: "Martin example 1",
			args: args{n: "1"},
			want: 1,
		},
		{
			name: "Martin example 2",
			args: args{n: "2"},
			want: 2, // 1 + 1
		},
		{
			name: "Martin example 1",
			args: args{n: "3"},
			want: 3, // 1 + 1 + 1
		},
		{
			name: "Martin example 3",
			args: args{n: "10"},
			want: 1, // 10
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minPartitions(tt.args.n); got != tt.want {
				t.Errorf("minPartitions() = %v, want %v", got, tt.want)
			}
		})
	}
}
