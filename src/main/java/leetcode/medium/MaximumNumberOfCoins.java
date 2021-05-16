package leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
/*
*
Input: piles = [2,4,1,2,7,8]
Output: 9

Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
The maximum number of coins which you can have are: 7 + 2 = 9.
On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
* */
public class MaximumNumberOfCoins {

    public static void main(String[] args) {
        System.out.println("qwe");
        System.out.println(new MaximumNumberOfCoinsSolution().maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
        System.out.println(new MaximumNumberOfCoinsSolution().maxCoins(new int[]{2, 4, 5}));
        System.out.println(new MaximumNumberOfCoinsSolution().maxCoins(new int[]{9,8,7,6,5,1,2,3,4}));
    }
}

class MaximumNumberOfCoinsSolution{

    public int maxCoins(int[] piles) {

        Arrays.sort(piles);
        int sum = 0;
        int length = piles.length;
        for(int i = 0;  i < piles.length/3; i++){
            length -= 2;
            sum += piles[length];
        }
        return sum;
    }
}
