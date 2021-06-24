package leetcode.best.easy.design;

public class FirstUniqueCharacterInString {


    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
    public static void main(String[] args) {


        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("leetcode"));
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("loveleetcode"));
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("leaabbetcode"));
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("eeeeleeeetcoddae"));

    }


    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            System.out.println("index"+ index);
            int lastIndex = s.lastIndexOf(c);
            System.out.println("lastIndex"+ lastIndex);
            if(index == lastIndex)
                return index;
        }
        return -1;
    }
}
