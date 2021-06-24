package leetcode.best.medium.arrayandstring;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        System.out.println(new MissingRanges().findMissingRanges(new int[]{0,1,3,50,75}, 1, 80));
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int curr = (i < nums.length) ? nums[i] : upper + 1;
            if (prev + 1 <= curr - 1) {
                result.add(formatRange(prev + 1, curr - 1));
            }
            prev = curr;
        }
        return result;
    }

    // formats range in the requested format
    private String formatRange(int lower, int upper) {
        if (lower == upper) {
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }


}
