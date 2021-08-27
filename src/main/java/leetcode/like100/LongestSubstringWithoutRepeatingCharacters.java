package leetcode.like100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(new Solution3().lengthOfLongestSubstring("abcabcbb"));
    }

}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        /*List list = new ArrayList<>();172.27.224.0
        list.re()*/
        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
