import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static <E> void main(String[] args) {

        List list = new ArrayList();
        List<E> listGeneric = new ArrayList();
        List<Integer> listGenericToInteger = new ArrayList();

        GenericArray<Integer> genericArray = new GenericArray();
        GenericArray<String> genericArrayString = new GenericArray();

        genericArray.add(1);
        genericArray.add(2);
        //genericArray.add("1");
        genericArrayString.add("2");

        int resultInteger1 = genericArray.get(0);
        int resultInteger2 = genericArray.get(1);

        System.out.println(resultInteger1+resultInteger2);

        GenericLimitForNumber<Number> num = new GenericLimitForNumber();
        GenericLimitForNumber<Integer> testInt = new GenericLimitForNumber();

        num.add(1);
        testInt.add(1);

        int n = (int) num.get(0);
        int t = testInt.get(0);


        new GenericLimitForComparable<Chronology>().compareTo(new GenericLimitForComparable<String>().toString());

        GenericLimitForNumber.<String>printFirstChar("장총명");
        GenericLimitForNumber.printFirstChar("장총명");

    }

  /*  public void barT(List<T super Integer> list) {
        System.out.println();
    }

    public void barE(List<E super Integer> list) {
        System.out.println();
    }

    public void barW(List<? super Integer> list) {
        System.out.println();
    }

    public class Foo <T extends Comparable<T> & Cloneable> {

    }*/



    static class GenericArray<T>{

        private T[] elements;
        private int size;

        public void add(T value){
            this.elements[size++] = value;
        }

        public T get(int idx) {
            return (T) this.elements[idx];
        }
    }
}
