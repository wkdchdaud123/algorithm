package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClone extends TestAbstract{


    public static void main(String[] args) {
        /*new ArrayClone().abTest();
        new ArrayClone().finalTest();*/

        List<String> list = new ArrayList<>();
        list.add(0, "qwe");
        list.add(1, "asdf");
        list.add(0, "wkd");

        for(String str : list ){
            System.out.println(str);
        }

        String nullTest = null;

        if(nullTest.isEmpty()){
            System.out.println("tetetette");
        }
    }

    private final void finalTest(){
        System.out.println("test");
    }
      @Override
    public void abTest() {
        System.out.println("asdasd");
    }

    /*private final int[] array;

    public ArrayClone(final int[] array) {
        this.array = Arrays.copyOf(array,array.length);
    }


    public int[] getArray() {
        return (array == null) ? null : array.clone();
    }*/

}
