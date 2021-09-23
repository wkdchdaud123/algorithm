package leetcode.easy;


import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {

    public static void main(String[] args) {


        for (int a : new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)) System.out.println(a);
        for (int a : new TwoSum().twoSum(new int[]{3,2,4}, 6)) System.out.println(a);
        for (int a : new TwoSum().twoSum(new int[]{3,3}, 6)) System.out.println(a);

    }
    //O(N제곱)
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length-1; i++){
            for(int y = i+1; y < nums.length; y++ ){
                if(nums[i] + nums[y] == target) return new int[]{i, y};
            }
        }
        return null;
    }

    //
    public int[] twoSumImprovement(int[] nums, int target) {

        // inserted Value & Indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Filling the HashMap
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        // Searching for the target indices
        for(int i = 0; i < nums.length; i++){
            // I will get my first element Example:- [2,7,11,15], target = 9
            int num = nums[i]; // I will get 2
            int rem = target - num; // Calculating remaining value = 9 - 2 = 7 will get from here
            if(map.containsKey(rem)){ // Now I will check is on any index 7 present.
                int index = map.get(rem); // From here i will get the index for no. 7
                if(index == i) continue; // By doing this i will handle the case to not select more then one of yourself.
                return new int[]{i, index}; // returning the array with their indices.
            }
        }
        return new int[]{}; // If we unable to found return empty array.
    }
}
