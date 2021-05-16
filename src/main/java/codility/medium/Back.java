package codility.medium;

public class Back {


    public static void main(String[] args) {

        BackSolution backSolution = new BackSolution();

        System.out.println(backSolution.solution(new int[]{1, 0, 1, 0, 1, 1}));
        System.out.println(backSolution.solution(new int[]{1, 1, 0, 1, 1}));
        System.out.println(backSolution.solution(new int[]{0, 1, 0}));
        System.out.println(backSolution.solution(new int[]{0, 1, 1, 0}));
    }


}

class BackSolution{

    public int solution(int[] A){
        //char[] chars = String.valueOf(A).toCharArray().;


        int zeroCnt = 0;
        int zeroExpected = 0;
        for(int i = 0; i < A.length; i++){
            if (A[i] != 0) zeroCnt++;
            zeroExpected = flip(zeroExpected);
        }

        int oneCnt = 0;
        int oneExpected = 1;
        for(int i = 0; i < A.length; i++){
            if (A[i] != 1) oneCnt++;
            oneExpected = flip(oneExpected);

        }


        return Math.min(zeroCnt, oneCnt) ;
    }

    public static int flip(int ch)
    {
        return (ch == 0) ? 1 : 0;
    }

    //  Utility method to get minimum flips when
    //  alternate string starts with expected char
    public static int getFlipWithStartingCharcter(int[] chars,
        int expected)
    {
        int flipCount = 0;
        for (int i = 0; i < chars.length; i++)
        {
            //  if current character is not expected,
            // increase flip count
            if (chars[i] != expected)
                flipCount++;

            //  flip expected character each time
            expected = flip(expected);
        }
        return flipCount;
    }

    // method return minimum flip to make binary
    // string alternate
    public static int minFlipToMakeStringAlternate(int[] chars)
    {
        //  return minimum of following two
        //  1) flips when alternate string starts with 0
        //  2) flips when alternate string starts with 1
        return Math.min(getFlipWithStartingCharcter(chars, 0),
            getFlipWithStartingCharcter(chars, 1));
    }
}
