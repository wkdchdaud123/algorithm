package codility.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @url https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 * @author jang.cm
 * @since 1.0
 */
public class PermMissingElem {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,5}));
    }
}

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
