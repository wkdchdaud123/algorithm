package leetcode.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("릿코드 숫자배열에서 홀수만의 합계구하기")
public class SumOfAllOddLengthSubArraysTest {


    @Test
    @DisplayName("test")
    public void solution(){
        //1. given
        int actualResult ;
        int expectResult = 58;
        int[] inputArrays = new int[]{1,4,2,5,3};
        SumOfAllOddLengthSubArrays solution = new SumOfAllOddLengthSubArrays();

        //2. when
        actualResult = solution.sumOddLengthSubArrays(inputArrays);

        //3. then
        Assertions.assertEquals(expectResult, actualResult);
    }

}
