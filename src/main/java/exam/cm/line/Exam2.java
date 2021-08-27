package exam.cm.line;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] inputs = new int[N][2];
        for (int i = 0; i < N; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            inputs[i] = (Arrays.stream(new int[]{first, second}).sorted().toArray());
        }
        //6
        //1 3
        //3 4
        //6 5
        //11 15
        //12 17
        //12 15
 // 31 56 43
        //Arrays.sort(inputs, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(inputs, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {// 5 6, 1 3
                int sorted;

                if (t1[0] < t2[0]){
                    sorted = -1;
                }else if (t1[0] == t2[0] && t1[1] < t2[1]){
                    sorted = -1 ;
                }else {
                    sorted = 0;
                }
                return sorted;
            }
        });

        //Arrays.sort(inputs, (a1, a2) -> a2[0] - a1[0]);

        Map<Integer, Set<Integer>> resultMap = new HashMap<>();

        int index = 1;
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("start"+index, inputs[0][0]);
        numberMap.put("end"+index, inputs[0][1]);

        boolean isChange;
        for (int i = 1; i < inputs.length; i++) {
            isChange = false;
            if (inputs[i][0] >= numberMap.get("start"+index) && inputs[i][0] <= numberMap.get("end"+index)) {
                if (inputs[i][1] > numberMap.get("end"+index)) {
                    numberMap.put("end"+index, inputs[i][1]);
                }
                isChange = true;
            }

            if (inputs[i][1] <= numberMap.get("end"+index) && inputs[i][1] >= numberMap.get("start"+index)) {
                if (inputs[i][0] < numberMap.get("start"+index)) {
                    numberMap.put("start"+index, inputs[i][0]);
                }
                isChange = true;
            }

            if (!isChange) {
                index++;
                numberMap.put("start"+index, inputs[i][0]);
                numberMap.put("end"+index, inputs[i][1]);
            }
        }

        index = 1;
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i][0] >= numberMap.get("start"+index) && inputs[i][1] <= numberMap.get("end"+index)) {
                numberSet.add(inputs[i][0]);
                numberSet.add(inputs[i][1]);
                resultMap.put(index, numberSet);
            } else {
                numberSet = new HashSet<>();
                i--;
                index++;
            }
        }

        System.out.println(resultMap.size());
    }

}
