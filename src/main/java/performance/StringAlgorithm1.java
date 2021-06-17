package performance;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
public class StringAlgorithm1 {

    public static void main(String[] args) {
        new StringAlgorithm1().reverseString(new char[]{'h','e','l','l','o'});
    }

    public char[] reverseString(char[] s) {
        return new StringBuilder(String.valueOf(s)).reverse().toString().toCharArray();
    }
}
