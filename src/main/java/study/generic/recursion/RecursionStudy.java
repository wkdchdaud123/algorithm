package study.generic.recursion;

public class RecursionStudy {

    public static void main(String[] args) {

        // 일반적인 상황에서 for문과 재귀함수에서는 for문을 써야지 잘못하면 stack overflow가 터치지 당연히 스택사이즈는 한정적인데...
        // function(10); stack over flow

        ////System.out.println(function(10));


        /*for(int i = 0; i < 1000000; i++){
            System.out.println("반갑습니다");
        }*/
    }

    private static int  function(int count){
        if (count == 1){
            return 1;
        } else {
            return count + function(count -1 );
        }
    }

}
