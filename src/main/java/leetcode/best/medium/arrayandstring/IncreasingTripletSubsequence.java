package leetcode.best.medium.arrayandstring;

public class IncreasingTripletSubsequence {


    //Input: nums = [1,2,3,4,5]
    //Output: true
    //Explanation: Any triplet where i < j < k is valid.

    //Input: nums = [5,4,3,2,1]
    //Output: false
    //Explanation: No triplet exists.

    //Input: nums = [2,1,5,0,4,6]
    //Output: true
    //Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
    public static void main(String[] args) {
        new IncreasingTripletSubsequence().increasingTriplet(new int[]{10,20,3,2,1,1,2,0,4});

        System.out.println(Integer.MAX_VALUE);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n <= first_num) {
                first_num = n;
            } else if (n <= second_num) {
                second_num = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
