package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class LengthTest {

    HashMap rootHm;
    public static List<Integer> rootInt;

    public static String sTest= "s";
    public  String nonTest;
    public static void main(String[] args) {


        String str = "f52fbd32b2b3b86ff88ef6c490628285f482af15ddcb29541f94bcf526a3f6c7";
        String phoneString = "ㄱㅗㅇㅇㅣㄹㄱㅗㅇㄷㅐㅅㅜㅣㅇㅣㅅㅏㅁㅇㅣㄹㅇㅣㄷㅐㅅㅜㅣㅇㅣㅅㅏㅇㅣㅇㅠㄱ";
        System.out.println(phoneString.getBytes().length);

        HashMap hm = new HashMap();
        LengthTest qwe = new LengthTest();
        LengthTest qwe2 = new LengthTest();
        System.out.println(sTest);
        System.out.println(new LengthTest().nonTest);
        System.out.println(new LengthTest().rootInt);
        System.out.println(new LengthTest().rootHm);
        System.out.println(hm);
        System.out.println(qwe);
        System.out.println(qwe.hashCode());
        System.out.println(qwe2);
        System.out.println(qwe2.hashCode());



        /*for (int i = 0; i <str.length(); i++){
            System.out.println(i);
        }*/
    }

}
