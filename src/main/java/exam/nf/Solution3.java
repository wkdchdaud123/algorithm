package exam.nf;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public static void main(String[] args) {

        System.out.println(new Solution3().solution("aaaabbbb"));
        System.out.println(new Solution3().solution("ccaaffddecee"));
        System.out.println(new Solution3().solution("eeee"));
        System.out.println(new Solution3().solution("example"));

    }

    public int solution(String S) {
            int[] englishWordCountArray = new int[26];

            for (char c : S.toCharArray()) {
                englishWordCountArray[c - 'a']++;
            }
            int deleteSumCount = 0;
            Set<Integer> set = new HashSet<>();
            for (int wordCount : englishWordCountArray) {
                if (wordCount == 0) continue;
                while (set.contains(wordCount)) {
                    wordCount--;
                    deleteSumCount++;
                }
                if (wordCount != 0) {
                    set.add(wordCount);
                }
            }
            return deleteSumCount;
    }
}
