package leetcode.easy;


/**
 * @author jang.cm
 * @url https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * @since 1.0
 */
public class SumOfAllOddLengthSubArrays {

    public int sumOddLengthSubArrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length + 1; i++) {
            if (isOdd(i)) { //1,3,5
                for (int j = 0; j < (arr.length - i) + 1; j++) {
                    int tempSum = 0;
                    for (int b = 0; b < i; b++) {
                        tempSum += arr[j + b];
                    }
                    sum += tempSum;
                }
            }
        }
        return sum;
    }

    private boolean isOdd(int param) {
        return param % 2 == 1;
    }


    public int sumOddLengthSubArraysInCodeBest(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
        return sum;
    }

}
