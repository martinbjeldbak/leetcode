package issubsequence

import "testing"

func Test_isSubsequence(t *testing.T) {
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
			args: args{s: "abc", t: "ahbgdc"},
			want: true,
		},
		{
			name: "Example 2",
			args: args{s: "axc", t: "ahbgdc"},
			want: false,
		},
		{
			name: "Explanation example 1",
			args: args{s: "ace", t: "abcde"},
			want: true,
		},
		{
			name: "Explanation example 2",
			args: args{s: "aec", t: "abcde"},
			want: false,
		},
		{
			name: "Failed example 1",
			args: args{s: "", t: "ahbgdc"},
			want: true,
		},
		{
			name: "Failed example 2",
			args: args{s: "b", t: "abc"},
			want: true,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isSubsequence(tt.args.s, tt.args.t); got != tt.want {
				t.Errorf("isSubsequence() = %v, want %v", got, tt.want)
			}
		})
	}
}
