package study.staticTest;

import java.util.Map;

public class StaticTest {

    static final Integer sfInteger = 0 ;
    static Integer sInteger = 0 ;


    public static void main(String[] args) {
        //새로운 인스턴스라도 무조건 값 공유
        System.out.println(StaticTest.sInteger = 10);
        System.out.println(new StaticTest().sInteger);
        System.out.println(new StaticTest().sfInteger);

        StaticTest sfInteger = new StaticTest();
        StaticTest sInteger = new StaticTest();

        System.out.println(sfInteger.sInteger);
        sfInteger.sInteger = 10 ;
        System.out.println(sfInteger.sfInteger);

        System.out.println(sInteger.sInteger);
        System.out.println(sInteger.sfInteger);
    }

}
