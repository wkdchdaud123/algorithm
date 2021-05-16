package programmers.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class Lessons42576 {

    public static void main(String[] args) {
        Lessons42576Solution lessons42576Solution = new Lessons42576Solution();

        lessons42576Solution.solution(new String[]{"leo", "kiki","eden"},  new String[]{"eden", "kiki"});
    }
}

class Lessons42576Solution{

    public String solution(String[] participant, String[] completion){
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();
        for(String element : participant){
            hashMap.put(element, hashMap.getOrDefault(element, 0)+1);
            System.out.println(hashMap.toString());
        }
        for(String element : completion){
            hashMap.put(element, hashMap.get(element)-1);
            System.out.println(hashMap.toString());
        }

        for(String key : hashMap.keySet() ){
            if (hashMap.get(key) != 0){
                answer += key;
            }
        }

//        for(int i=0; i < participant.length)

        return answer;
    }

}
