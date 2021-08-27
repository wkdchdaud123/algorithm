package exam.nf;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {

        System.out.println(new Solution2().solution1("apple","pear")); // 오답
        System.out.println(new Solution2().solution("apple","pear"));
    }

    public int solution1(String A, String B) {
        // write your code in Java SE 8
        int differenceCount = 0;
        HashMap<Character, Integer> AWord = new HashMap();
        HashMap<Character, Integer> BWord = new HashMap();

        for(char ch : A.toCharArray()){
            AWord.put(ch, AWord.getOrDefault(ch, 0) + 1);
        }

        for(char ch : B.toCharArray()){
            BWord.put(ch, BWord.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> AWordEntry : AWord.entrySet()){
            if(BWord.containsKey(AWordEntry.getKey())){
                int diff = AWordEntry.getValue() - BWord.get(AWordEntry.getKey());
                if(diff > 0)
                    differenceCount += diff;
            } else {
                differenceCount += AWordEntry.getValue();
            }
        }

        return differenceCount;
    }

    public int solution(String A, String B) {
        Result result = new Result();

        Map<Byte, Integer> aMap = setMap(A);
        Map<Byte, Integer> bMap = setMap(B);

        aMap.forEach((key, count) -> switching(key, count, bMap, result));
        bMap.forEach((key, count) -> switching(key, count, aMap, result));

        return result.getCount();
    }

    private Map<Byte, Integer> setMap(String input) {
        Map<Byte, Integer> byteIntegerMap = new HashMap<>();
        for (Byte bt: input.getBytes()) {
            if (byteIntegerMap.containsKey(bt)) {
                Integer count = byteIntegerMap.get(bt);
                byteIntegerMap.put(bt, ++count);
            } else {
                byteIntegerMap.put(bt, 1);
            }
        }
        return byteIntegerMap;
    }

    private void switching(Byte key, Integer count, Map<Byte, Integer> map, Result result) {
        if (map.containsKey(key)) {
            if (map.get(key) < count) {
                result.addCount(count-map.get(key));
            }
        } else {
            result.addCount(count);
        }
    }
}

class Result {
    private Integer count;

    public Result() {
        this.count = 0;
    }

    public Integer getCount() {
        return this.count;
    }

    public void addCount(Integer count) {
        this.count += count;
    }
}
