package exam;

import java.util.HashMap;

public class Task1 {

    // 월 총 비용이 100이상이면서 3회이상 지불 이자가 붙지 않고 월이자는 5이다.
    // 0 미만이면 카드 결제(-) 아니면 입금(+)이다.
    public static void main(String[] args) {
        new Solution().solution(new int[] {100, 100, 100}, new String[] {"2020-12-31", "2020-12-22", "2020-12-03"});
        new Solution().solution(new int[] {180, -50, -25, -25}, new String[] {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"});
        new Solution().solution(new int[] {1, -1, 0, -105, 1}, new String[] {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"});
        new Solution().solution(new int[] {100, 100,-105, -20, -30}, new String[] {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"});

    }
}


class Solution {

    private int balance = 0;
    private int cnt = 0;
    private int MONTH_FEE = 5;

    public int solution (int[] A, String [] D){

        HashMap<String, Integer> hashMap = new HashMap<>();
        int initMonthFeeRate = 12;
        for(int i=0; i<D.length; i++){

            String mapKey = D[i].substring(0, 7);

            if(hashMap.containsKey(mapKey)){
                if(hashMap.get(mapKey) < 0){
                    if(cnt > 2){
                        initMonthFeeRate--;
                    }
                }

                int orgMonthPrice=hashMap.get(mapKey);
                hashMap.put(mapKey, orgMonthPrice+A[i]);
            }else{
                hashMap.put(mapKey, A[i]);
            }

        }
        System.out.println(hashMap.toString());


        // 해당 키가 3개이면서 100이상 인가 ? 그렇다면 -1
        return 1 ;
    }
}