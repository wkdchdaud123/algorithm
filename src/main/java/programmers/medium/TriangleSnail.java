package programmers.medium;


/**
 * @author jang.cm
 * @url https://programmers.co.kr/learn/courses/30/lessons/68645?language=java
 * @since 1.0
 */

public class TriangleSnail {

    public static void main(String[] args) {
        TriangleSnail ts = new TriangleSnail();
        ts.TriangleSnailSolution(4);
    }
    public int[] TriangleSnailSolution(int n) {
        int[] answer = new int[(n * (n + 1)) / 2]; // 10
        int[][] matrix = new int[n][n]; // 4,4

        int x = -1, y = 0;
        int num = 1;

        int test = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                if (isRemainderToParam(i, 0)) {
                    ++x;
                } else if (isRemainderToParam(i, 1)) {
                    ++y;
                } else if (isRemainderToParam(i, 2)) {
                    --x;
                    --y;
                }
                matrix[x][y] = num++;
                System.out.println(++test);
                System.out.println("i : "+i);
                System.out.println("j : "+j);

            }
        }

        int k = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    break;
                }
                answer[k++] = matrix[i][j];
            }
        }
        return answer;
    }


    private boolean isRemainderToParam(int count, int param){
        return count % 3 == param;
    }
}
