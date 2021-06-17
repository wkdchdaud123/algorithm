package programmers.easy;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
//Input: x = 123
//Output: 321
//Input: x = -123
//Output: -321
//Input: x = 120
//Output: 21
//Input: x = 0
//Output: 0
public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(new ReverseInteger().reverse(123));
        System.out.println(new ReverseInteger().reverse(-123));
        System.out.println(new ReverseInteger().reverse(120));
        System.out.println(new ReverseInteger().reverse(0));
    }

    public int reverse(int x) {

        if (x == 0) return 0;

        if (x < 0){
            x = Integer.parseInt("-" + new StringBuilder(-x+"").reverse());
        } else {
            x = Integer.parseInt(new StringBuilder(x+"").reverse().toString());
        }
        return x;

    }
}
