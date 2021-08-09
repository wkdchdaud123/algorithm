package leetcode.like100;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        System.out.println("result : "+ new Solutiona().twoSum(new int[]{1,3,4,6,5,2,3}, 10));
    }
}

//Time Complexity : O(n2) Space Complexity : O(1)
class Solutiona {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if( nums[i] == target ) return new int[] {nums[i]};
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

//Time Complexity : O(n) Space Complexity : O(n)
class SolutionTwo {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

//Time Complexity : O(n) Space Complexity : O(n)
    class SolutionThree {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            // In case there is no solution, we'll just return null
            return null;
        }
}
