package codility.medium;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {

        DistinctSolution distinctSolution = new DistinctSolution();
        System.out.println(distinctSolution.solution(new int[]{2, 1, 1, 2, 3, 1}));

    }
}

class DistinctSolution{

    public int solution(int[] A){
        return Arrays.stream(A).distinct().toArray().length;
    }

}
