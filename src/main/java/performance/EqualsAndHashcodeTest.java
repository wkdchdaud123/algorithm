package performance;

import java.util.Enumeration;
import java.util.Vector;

public class EqualsAndHashcodeTest {

    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true

        String sNew1 = new String("test");
        String sNew2 = new String("test");
        System.out.println(sNew1 == sNew2); //false
        System.out.println(sNew1.equals(sNew2)); //true 같은이유는 String class에서 재정의했음 Equals를

       /* StringBuffer;
        StringBuilder;
        Enumeration;
        Vector*/



    }

}
