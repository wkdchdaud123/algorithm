package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
public class StringAlgorithm1 {

    public static void main(String[] args) {
        new StringAlgorithm1().reverseString(new char[]{'h','e','l','l','o'});
        StringTest st = new StringTest();
        st.testint = 11;
        StringTest.testStaticInt=13;
        System.out.println(st.testint);
        System.out.println(StringTest.testStaticInt);

        List<String> list = new ArrayList<>();
        list.iterator();

        Collection<String> colList = new ArrayList<>();
        colList.iterator();

    }

    public char[] reverseString(char[] s) {
        return new StringBuilder(String.valueOf(s)).reverse().toString().toCharArray();
    }
}
