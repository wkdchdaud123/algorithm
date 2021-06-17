package leetcode.best.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ArrayAndStrings {


    public static void main(String[] args) {

        System.out.println(new ArrayAndStrings().threeSum(new int[]{-1,0,1,2,-1,-4}));

    }
    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/
    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

    //https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/
    //1.
        //Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        //Output: [[1,0,1],[0,0,0],[1,0,1]]
    //2.
        //Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        //Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, k = 0;
        // First row has zero?
        while (k < n && matrix[0][k] != 0) ++k;
        // Use first row/column as marker, scan the matrix
        for (int i = 1; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (matrix[i][j] == 0)
                    matrix[0][j] = matrix[i][0] = 0;
        // Set the zeros
        for (int i = 1; i < m; ++i)
            for (int j = n - 1; j >= 0; --j)
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
        // Set the zeros for the first row
        if (k < n) Arrays.fill(matrix[0], 0);
    }

}
