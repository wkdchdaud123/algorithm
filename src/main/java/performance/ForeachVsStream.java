package performance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachVsStream {

    static Integer streamSum = 0;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0; i< 10000; i++){
            list.add(i);
        }
        Integer foreachSum = 0;
        long foreachStart = System.currentTimeMillis();
        for(Integer integer : list){
            foreachSum += integer;
        }
        System.out.println(foreachSum);
        long foreachEnd = System.currentTimeMillis();
        System.out.println("수행시간: " + (foreachEnd - foreachStart) + " ms");

        Integer whileSum = 0;
        Iterator it = list.iterator();
        long whileStart = System.currentTimeMillis();
        while (it.hasNext()){
            whileSum += (Integer) it.next();
        }
        System.out.println(whileSum);
        long whileEnd = System.currentTimeMillis();
        System.out.println("수행시간: " + (whileEnd - whileStart) + " ms");


        //빠른 순서는 Itrator > foreach > 스트림 시간이 더느린데 항상 비교를 해보자 디컴파일 소스 확인 완료.
        long streamStart = System.currentTimeMillis();
        list.stream().forEach(i -> streamSum += i);
        System.out.println(streamSum);
        long streamEnd = System.currentTimeMillis();
        System.out.println("수행시간: " + (streamEnd - streamStart) + " ms");


    }

}
