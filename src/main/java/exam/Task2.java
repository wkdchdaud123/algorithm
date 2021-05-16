package exam;

import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {
        new SolutionTask2().solution(new int[]{-3, -14, -5, 7, 8, 42, 8, 3}); //4로 나누면 2개씩
        new SolutionTask2().solution(new int[]{2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18}); //4로 나누면 3개씩
    }
}

class SolutionTask2 {

    private HashMap<String, Integer[]> seasonMap;

    public String solution (int [] T) {


        SeasonStateTask2 seasonStateTask2 = new SeasonStateTask2(SeasonTask2.WINTER);

        System.out.println(0%4);
        for(int i=0; i<T.length; i += T.length/4){
            if(T.length%4==0){


            };
        }


        int seasonDivide = T.length/4;

        return "";
    }

}

class SeasonStateTask2{

    private SeasonTask2 seasonTask2;

    SeasonStateTask2(SeasonTask2 firstSeason){
        this.seasonTask2 = firstSeason;
    }

    public String getSeasonName(){
        return this.seasonTask2.name();
    }

    public void next(){
        if(SeasonTask2.WINTER.equals(this.seasonTask2.name())){
            this.seasonTask2 = SeasonTask2.SPRING;
        }else if(SeasonTask2.SPRING.equals(this.seasonTask2.name())){
            this.seasonTask2 = SeasonTask2.SUMMER;
        }else if(SeasonTask2.SUMMER.equals(this.seasonTask2.name())) {
            this.seasonTask2 = SeasonTask2.AUTUMN;
        }else {
            this.seasonTask2 = SeasonTask2.WINTER;
        }

    }

}
enum SeasonTask2{
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

}