package happynumber

import "testing"

func Test_happyNumber(t *testing.T) {
	type args struct {
		n int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{
			name: "Example 1",
			args: args{n: 19},
			want: true,
		},
		{
			name: "Example 2",
			args: args{n: 2},
			want: false,
		},
		{
			name: "Failed input",
			args: args{n: 1111111},
			want: true,
		},
		{
			name: "Failed input 2",
			args: args{n: 3},
			want: false,
		},
		{
			name: "Failed input 3",
			args: args{n: 7},
			want: true,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := isHappy(tt.args.n); got != tt.want {
				t.Errorf("isSubsequence() = %v, want %v", got, tt.want)
			}
		})
	}
}
