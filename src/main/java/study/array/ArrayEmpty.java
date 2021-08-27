package study.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEmpty {

    public static void main(String[] args) {



        int pay = 58000000;
        int sum = 0;
        for(int i = 1; i < 6; i++){
            pay *= 1.05;
            sum += pay;

        }
        System.out.println(pay);

    }

}
