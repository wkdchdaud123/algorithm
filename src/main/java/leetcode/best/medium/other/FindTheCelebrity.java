package leetcode.best.medium.other;

public class FindTheCelebrity {

    public static void main(String[] args) {

        int[][] graph = new int[][]{{1,1,0},{0,1,0},{1,1,1}};
        //3행 3열
        // 0행 0열 (1) = 0번 사람은 0번을 암
        // 0행 1열 (1) = 0번 사람은 1번을 암
        // 0행 2열 (0) = 0번 사람은 2번을 모름
        // 1행 0열 (0) = 1번 사람은 0번을 모름
        // 1행 1열 (1) = 1번 사람은 1번을 암
        // 1행 2열 (0) = 1번 사람은 2번을 모름
        // 2행 0열 (1) = 2번 사람은 0번을 암
        // 2행 1열 (1) = 2번 사람은 1번을 암
        // 2행 2열 (1) = 2번 사람은 2번을 암


    }

    private int numberOfPeople;

    public int findCelebrity(int n) {
        numberOfPeople = n;
        for (int i = 0; i < n; i++) {
            if (isCelebrity(i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isCelebrity(int i) {
        for (int j = 0; j < numberOfPeople; j++) {
            if (i == j) continue; // Don't ask if they know themselves.
            /*if (knows(i, j) || !knows(j, i)) {
                return false;
            }*/
        }
        return true;
    }

}
