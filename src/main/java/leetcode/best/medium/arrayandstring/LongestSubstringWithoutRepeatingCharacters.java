package leetcode.best.medium.arrayandstring;


import java.util.HashMap;
import java.util.Map;

//Input: s = "abcabcbb"
//Output: 3
public class LongestSubstringWithoutRepeatingCharacters {



    public static void main(String[] args) {

        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");

    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
