package leetcode.medium;


//https://leetcode.com/problems/subrectangle-queries/
public class SubrectangleQueries {

    public static void main(String[] args) {

        Solution obj = new Solution(new int[][]{{1,2,1},{4,3,4},{3,2,1},{1,1,1}});
        System.out.println(obj.getValue(0, 2)); // return 1
        obj.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(obj.getValue(1,2));
        System.out.println(obj.getValue(0, 2)); // return 5
        System.out.println(obj.getValue(3, 1)); //5
        obj.updateSubrectangle(3, 0, 3, 2, 10);
        System.out.println(obj.getValue(3, 1)); // return 10
        System.out.println(obj.getValue(0, 2)); // return 5`*/

    }

}

class Solution {

    private static int[][] rectangle;

    public Solution(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int intValue) {
        for(int row = row1; row < row2+1; row++){
            for(int col = col1; col < col2+1; col++){
                rectangle[row][col] = intValue;
            }
        }
    }

    public int getValue(int row, int col){
        return rectangle[row][col];
    }

}
