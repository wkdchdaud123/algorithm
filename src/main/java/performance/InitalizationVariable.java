package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InitalizationVariable {


    int a;
    static int aStatic;

    public static void main(String[] args) {

        int b = -1;
        int c ;
        c=0;
        System.out.println(aStatic);
        System.out.println(c);
        System.out.println(new InitalizationVariable().a);

    }
}
