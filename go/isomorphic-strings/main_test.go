package main

import "testing"

func Test_isIsomorphic(t *testing.T) {
	type args struct {
		s string
		t string
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{
			name: "Example 1",
			args: args{s: "egg", t: "add"},
			want: true,
		},
		{
			name: "Example 2",
			args: args{s: "foo", t: "bar"},
			want: false,
		},
		{
			name: "Example 3",
			args: args{s: "paper", t: "title"},
			want: true,
		},
		{
			name: "Failed 1",
			args: args{s: "badc", t: "baba"},
			want: false,
		},
		{
			name: "Failed 2",
			args: args{s: "a", t: "a"},
			want: true,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isIsomorphic(tt.args.s, tt.args.t); got != tt.want {
				t.Errorf("isIsomorphic() = %v, want %v", got, tt.want)
			}
		})
	}
}
