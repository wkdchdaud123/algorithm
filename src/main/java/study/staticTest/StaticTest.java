package study.staticTest;

import java.util.HashMap;
import java.util.Map;

public class StaticTest {

    static final Integer sfInteger = 0 ;
    static Integer sInteger = 0 ;


    public static void main(String[] args) {
        //새로운 인스턴스라도 무조건 값 공유
        System.out.println(StaticTest.sInteger = 10);
        System.out.println(new StaticTest().sInteger);
        System.out.println(new StaticTest().sfInteger);

        int a = 1;
        StaticTest sfInteger = new StaticTest();
        StaticTest sInteger = new StaticTest();

        System.out.println(sfInteger.sInteger);
        sfInteger.sInteger = 13 ;
        System.out.println(sfInteger.sfInteger);

        System.out.println(sInteger.sInteger);
        System.out.println(sInteger.sfInteger);

        System.out.println(sfInteger.equals(sInteger));
        String str1 = "0-42L";
        String str2 = "0-43-";

        System.out.println((str1.hashCode() == str2.hashCode()));
        System.out.println(str1.hashCode());
        Map map = new HashMap();
    }

}
