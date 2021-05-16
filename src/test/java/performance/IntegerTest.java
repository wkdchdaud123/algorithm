package performance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerTest {


    @Test
    @DisplayName("Integer 오버플로 Test")
    public void integerTest() {

        Integer i = 9999999;
        Integer a = 1073741823;

        System.out.println("맥스:" + Integer.MAX_VALUE);
        System.out.println("민:" + Integer.MIN_VALUE);
        System.out.println( (i * 9999) );
        System.out.println(a * 2);

        System.out.println(Integer.toBinaryString(a*2));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(-100));

        //111,1111,11111111,11111111,11111111
        //18,446,744,073,709,551,616
        //99,899,999,001
        //1,671,340,799
        //4,294,967,296
        //1,205,742,193
    }

}
