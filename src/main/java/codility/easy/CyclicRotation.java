package codility.easy;

public class CyclicRotation {


    public static void main(String[] args) {

        CyclicRotation cyclicRotation = new CyclicRotation();
        System.out.println(cyclicRotation.solution(new int[]{3,8,9,7,6} , 3));
    }

    public int[] solution ( int[] A, int K){
        int[] result = new int[A.length];
        for(int x = 0; x <= A.length-1; x++){
            //result(0+3)%5 = A[0]
            //result(1+3)%5 = A[1]
            //result(2+3)%5 = A[2]
            result[(x+K) % A.length ] = A[x];
        }
        return result;
    }

}
