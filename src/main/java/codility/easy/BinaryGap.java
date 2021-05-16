package codility.easy;

import java.util.StringTokenizer;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGapSolution bg = new BinaryGapSolution();

        System.out.println(bg.solution(56));
    }


}

class BinaryGapSolution {

    public int solution(int N) {
        //return Integer.toBinaryString(N);

        String binaryString = Integer.toBinaryString(N);

        char[] binaryChar = binaryString.toCharArray();
        int totalGapLength = 0;
        int gapLength = 0;

        for (int i = 0; i < binaryChar.length; ++i) {
            if (binaryChar[i] == '1') {
                if (gapLength > totalGapLength) totalGapLength = gapLength;

                gapLength = 0;
            } else {
                ++gapLength;
            }
        }

        return totalGapLength;
    }
}