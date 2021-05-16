package performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class ByteCodeExample {

    static class Inner{
        void test(){
            System.out.println("test");
        }
    }
    private int test = 0;

    public static void main(String[] args) {

        Math.random();
        new Inner().test();
        int[][] a = new int[][]{{1,2,3},{4,5,6}};
        System.out.println("a :" + a);
        System.out.println("a[0] :" + a[0]);
        System.out.println("a[1] :" + a[1]);

        int[][] aa = new int[][]{{1,2,3},{4,5,6}};
        int[][] aCopy = aa.clone();

        System.out.println("aa : " + aa);
        System.out.println("aCopy : " + aCopy);
        System.out.println("aa[0] : " + aa[0]);
        System.out.println("aCopy[0] : " + aCopy[0]);
        System.out.println("aa[1] : " + aa[1]);
        System.out.println("aCopy[1] : " + aCopy[1]);
        int b[] = new int[5];

        /*for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("a[i]" + a[i]);
            System.out.println("b[i]" + b[i]);

            System.out.println(a.length);
            System.out.println(b.length);
        }*/
        new ByteCodeExample().test();


        new TwoDimensionalArray().arrayTest();

    }

    private void test() {
        int[] a;
        int b;
        //System.out.println(a[1]);
        //System.out.println(b);
        int[] c = {1,2,3,4,5};
        int[] d = new int[]{1,2,3};
        int[] dd = d.clone();

        dd[1] = 0;

        for(int i=0; i< c.length; i++){

            System.out.println(c[i]);
        }

        new ReverseArray().reverse(c);

        for(int i=0; i< c.length; i++){
            System.out.println(c[i]);
        }
    }

}

class ReverseArray{

    public void swap(int[] c, int idx1, int idx2){
        int temp = c[idx1];
        c[idx1] = c[idx2];
        c[idx2] = temp;
    }

    public void reverse(int[] c){

        for(int i=0; i<c.length / 2; i++ ){
            swap(c,i, c.length-i-1);
        }

    }


}

class TwoDimensionalArray{

    class WhatClass {
        void test(){

        }
    }

    public void arrayTest(){
        int[][] arrayInt = new int[][]{{1,2,3,},{2,3,4,},};
        int[][] arrayIntCopy = arrayInt.clone();

        arrayIntCopy[0][0] = 4;

        System.out.println(arrayInt);
        System.out.println(arrayIntCopy);
        System.out.println("jcm : " + arrayInt[0][0]);

        int[][] arrayInt2 = new int[2][3];
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        //list.get()
        List list1 = new Vector();
        list1.add(1);
        Set set = new TreeSet();
        int[] intArray = new int[]{1,2,3};
        int[] intCopy = intArray.clone();
        intCopy[0] = 100;

        System.out.println("intArray : "+ intArray[0] + "    intCopy" + intCopy[0]);

        arrayInt2[0][0] = 2;

        arrayIntCopy[0][0] = 200;
        arrayIntCopy[0] = arrayInt2[0];

        System.out.println("arrayIntCopy : " +arrayIntCopy[0][0]);
        System.out.println("arrayIntCopy : " +arrayIntCopy[0][1]);
        System.out.println("arrayIntCopy : " +arrayIntCopy[0][2]);
        System.out.println("arrayInt : " +arrayInt[0][0]);
        System.out.println("arrayInt : " +arrayInt[0][1]);
        System.out.println("arrayInt : " +arrayInt[0][2]);

        System.out.println(arrayInt.toString());
        System.out.println(arrayInt[0].toString());
        System.out.println(arrayInt[1].toString());
        System.out.println(arrayInt[0][0]);
        System.out.println(arrayInt2.toString());
        System.out.println(arrayInt2[0].toString());
        System.out.println(arrayInt2[1].toString());

        //[I@6d06d69c
        //[I@7852e922
    }

}
