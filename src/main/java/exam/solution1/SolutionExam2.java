package exam.solution1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionExam2 {

    public static void main(String[] args) {

        System.out.println(new Solution2().solution(new int[]{-3,-14,-5,7,8,32,8,3}));
        System.out.println(new Solution2().solution(new int[]{2,-3,3,1,10,8,2,5,13,-5,3,-18}));
    }

}

class Solution2{

    public String solution(int[] T) {

        int seasonDivideCnt = T.length/4;
        Map<String, int[]> map = new HashMap<>();

        SeasonState seasonState = new SeasonState(Season.WINTER);

        int tempBigAmplitude = 0;
        String resultSeason = "";

        for (int i = 0; i < T.length; i += seasonDivideCnt){
            map.put(seasonState.getSeason(), Arrays.copyOfRange(T, i, i+seasonDivideCnt));

            int seasonMaxGap = getMaxGap(map.get(seasonState.getSeason()));

            if(tempBigAmplitude < seasonMaxGap) {
                tempBigAmplitude = seasonMaxGap;
                resultSeason = seasonState.getSeason();
            }

            seasonState.next();
        }
        return resultSeason;
    }

    private int getMaxGap(int[] temp){
        int max = Arrays.stream(temp).max().getAsInt();
        int min = Arrays.stream(temp).min().getAsInt() * -1;
        return Math.abs(max + min);
    }

}

class SeasonState{

    private Season season;

    SeasonState(Season season) {
        this.season = season;
    }

    public String getSeason(){
        return this.season.name();
    }

    public void next(){
        switch (this.season.name()) {
            case "WINTER":
                this.season = Season.SPRING;
                break;
            case "SPRING":
                this.season = Season.SUMMER;
                break;
            case "SUMMER":
                this.season = Season.AUTUMN;
                break;
            default:
                this.season = Season.WINTER;
        }
    }
}

enum Season{
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}
