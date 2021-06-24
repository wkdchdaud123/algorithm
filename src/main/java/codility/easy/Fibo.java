package codility.easy;

public class Fibo {




    public static void main(String args[]) {
        System.out.println("피보 10번째 수열은" + fibona(4));
    }
    public static int fibona(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return fibona(number - 1) + fibona(number - 2);
        }
    }

}
