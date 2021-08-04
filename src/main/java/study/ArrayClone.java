package study;

import java.util.Arrays;

public class ArrayClone extends TestAbstract{


    public static void main(String[] args) {
        new ArrayClone().abTest();
        new ArrayClone().finalTest();
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
