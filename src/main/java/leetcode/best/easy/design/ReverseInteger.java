package leetcode.best.easy.design;

public class ReverseInteger {


    public static void main(String[] args) {

        new ReverseInteger().reverse(321);

    }


    public int reverse(int x){
        long r = 0;
        while(x != 0){
            r = r*10 + x%10;
            System.out.println("r" + r);
            x /= 10;
            System.out.println("x" + x);
        }
        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
            return (int)r;
        else
            return 0;
    }

}
