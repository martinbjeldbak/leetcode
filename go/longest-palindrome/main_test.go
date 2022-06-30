package longestpalindrome

import "testing"

func Test_longestPalindrome(t *testing.T) {
	type args struct {
		s string
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{
			name: "Example 1",
			args: args{s: "abccccdd"},
			want: 7,
		},
		{
			name: "Example 2",
			args: args{s: "a"},
			want: 1,
		},
		{
			name: "Martin example 1",
			args: args{s: "abc"},
			want: 1,
		},
		{
			name: "Martin example 2",
			args: args{s: "bbaaac"},
			want: 5,
		},
		{
			name: "Martin example 3",
			args: args{s: "bbaaaa"},
			want: 6,
		},
		{
			name: "Failed example 3",
			args: args{s: "ababababac"},
			want: 9,
		},
		{
			name: "Failed example 1",
			args: args{s: "aaa"},
			want: 3,
		},
		{
			name: "Failed example 2",
			args: args{s: "ababababa"},
			want: 9,
		},
		{
			name: "Failed example 3",
			args: args{s: "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"},
			want: 983,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := longestPalindrome(tt.args.s); got != tt.want {
				t.Errorf("longestPalindrome() = %v, want %v", got, tt.want)
			}
		})
	}
}
