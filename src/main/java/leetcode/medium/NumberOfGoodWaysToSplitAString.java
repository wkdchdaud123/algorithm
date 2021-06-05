package leetcode.medium;


import java.util.*;

//https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
public class NumberOfGoodWaysToSplitAString {


    public static void main(String[] args) {

        System.out.println(new SolutionNum().numSplits("aacaba"));;

    }

}

class SolutionNum {
    public int numSplits(String s) {
        int size = s.length();
        int result = 0;
        for(int i = 0; i < size-1; i++){
            String forwardWord = forwardWordSplit(s, i);
            String backWord = backWordSplit(s, i, size);
            if (duplicateDeleteCount(forwardWord) == duplicateDeleteCount(backWord)) result++;
        }
        return result;
    }

    private String forwardWordSplit(String s, int startIdx){
        return s.substring(0, startIdx+1);
    }

    private String backWordSplit(String s, int startIdx, int endIdx){
        return s.substring(startIdx+1, endIdx);
    }

    private int duplicateDeleteCount(String word){
        Set<Character> set = new LinkedHashSet<>();
        for(char c :word.toCharArray()){
            set.add(Character.valueOf(c));
        }
        return set.size();
    }


    // BEST 베스트로 나와있는 것
    public int bestNumSplits(String s) {

        HashMap<Character, Integer> left = new HashMap<>();
        HashMap<Character, Integer> right = new HashMap<>();

        // put all the characters in the right hashmap and keep track of the count
        for(int i = 0; i < s.length(); i++){
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1);
        }

        // count the number of times the right is equal to the left, which is the result
        int count = 0;

        // loop through all the characters and add them to the left and remove them from the right
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            left.put(curr, left.getOrDefault(curr, 0) + 1);

            // I put a getOrDefault() here instead of just get() as a "just in case"
            //  but the "right" should have all the characters
            //  since we added all characters at the beginning
            //  adding an if statement increases runtime but getOrDefault() did not
            right.put(curr, right.getOrDefault(curr, 0) - 1);

            // if the count is equal to zero then remove the key/value pair
            if(right.get(curr) <= 0){
                right.remove(curr);
            }

            // if the two hashmaps are equal in size,
            // which means they have the same amount of keys,
            // which means they have the same amount of distinct characters
            // increment the count for the result
            if(left.size() == right.size()){
                count++;
            }
        }

        return count;
    }
}


