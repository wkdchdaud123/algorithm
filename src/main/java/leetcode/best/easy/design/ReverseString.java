package leetcode.best.easy.design;

public class ReverseString {


    public static void main(String[] args) {

        //Input: s = ["h","e","l","l","o"]
        //Output: ["o","l","l","e","h"]
        new ReverseString().reverseString(new char[]{'h','e','l','l','o'});

    }

    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){    //Do it half the number of String length
            char tmp = s[i];
            s[i] = s[s.length-1-i];     //Front swap with other End side
            s[s.length-1-i] = tmp;      //End swap with other Front side
        }
    }

}
