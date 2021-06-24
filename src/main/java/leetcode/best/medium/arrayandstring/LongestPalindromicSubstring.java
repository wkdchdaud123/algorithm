package leetcode.best.medium.arrayandstring;

public class LongestPalindromicSubstring {

    // https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/780/

    //Input: s = "babad"
    //Output: "bab"
    //Note: "aba" is also a valid answer.

    //Input: s = "cbbd"
    //Output: "bb"

    //Input: s = "a"
    //Output: "a"

    //Input: s = "ac"
    //Output: "a"
    public static void main(String[] args) {
        new LongestPalindromicSubstring().longestPalindrome("babad");
    }

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


}
