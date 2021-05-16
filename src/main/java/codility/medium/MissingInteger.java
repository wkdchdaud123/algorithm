package codility.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution
            .solution(new int[]{1, 3, 6, 4, 1, 2}); //[1, 3, 6, 4, 1, 2] return 5 [1,2,3] return 4
        System.out.println(solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }


}

class Solution {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        int max = Arrays.stream(A).max().getAsInt();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}

