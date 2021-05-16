package leetcode.hard;

import java.util.Stack;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] tempInputs=new int[]{4,2,0,3,2,5};
        Solution solution = new Solution();
        System.out.println(solution.trap(tempInputs));
    }

}

class Solution {
    public int trap(int[] height) {

        if(!isValidHeightsValue(height)) return 0;

        Stack<Integer> stack = new Stack<Integer>();
        int i = 0, maxWater = 0, maxBotWater = 0;
        while (i < height.length){
            if (stack.isEmpty() || height[i]<=height[stack.peek()]){
                stack.push(i++);
            }
            else {
                int bot = stack.pop();
                maxBotWater = stack.isEmpty() ? 0 : (Math.min(height[stack.peek()],height[i])-height[bot])*(i-stack.peek()-1);
                maxWater += maxBotWater;
            }
        }
        return maxWater;

    }

    private boolean isValidHeightsValue(int[] height){
        boolean isValidValue = true;
        if(height == null){
            isValidValue = false;
        }else if(height.length<0) {
            isValidValue = false;
        }

        return isValidValue;
    }

}
