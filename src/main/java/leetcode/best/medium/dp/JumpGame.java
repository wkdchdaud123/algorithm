package leetcode.best.medium.dp;

import java.util.Arrays;

public class JumpGame {

    public static void main(String[] args) {
        new JumpGame().canJump(new int[]{2,3,1,1,4});
    }

    // Time Complexity: O(N^2)
    // Space Complexity: O(N)
    Index[] memo;

    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        Arrays.fill(memo, Index.UNKNOWN);
        memo[memo.length - 1] = Index.GOOD;
        return canJumpFromPosition(0, nums);
    }

    public boolean canJumpFromPosition(int position, int[] nums) {
        if (memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD;
        return false;
    }


}

enum Index {
    GOOD, BAD, UNKNOWN
}


