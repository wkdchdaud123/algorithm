package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryMatrix {

    public static void main(String[] args) {


        SolutionMatrix solutionMatrix = new SolutionMatrix();
        System.out.println(solutionMatrix.reconstructMatrix(2,1, new int[]{1,1,1}));
        System.out.println(solutionMatrix.reconstructMatrix(2,3, new int[]{2,2,1,1}));
        System.out.println(solutionMatrix.reconstructMatrix(5,5, new int[]{2,1,2,0,1,0,1,2,0,1}));


    }
}

//Input: upper = 2, lower = 1, colsum = [1,1,1]
//Output: [[1,1,0],[0,0,1]]
//Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.
//upper 첫번째 행 합
//lower 두번째 행 합
class SolutionMatrix {

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(){{
            add(new ArrayList<Integer>());
            add(new ArrayList<Integer>());
        }};

        for(int i=0; i < colsum.length; i++){
            if(colsum[i] == 2){
                res.get(0).add(1);
                res.get(1).add(1);
                upper--;
                lower--;
            }else if(colsum[i] == 1){
                if(upper > lower){
                    res.get(0).add(1);
                    res.get(1).add(0);
                    upper--;
                }else{
                    res.get(0).add(0);
                    res.get(1).add(1);
                    lower--;
                }
            }else{
                res.get(0).add(0);
                res.get(1).add(0);
            }
        }

        if(lower != 0 || upper != 0){
            return Collections.emptyList();
        }

        return res;
    }

    private boolean isInvalidSolution(int upperLowerSum, int colSum) {
        return upperLowerSum != colSum;
    }
}
