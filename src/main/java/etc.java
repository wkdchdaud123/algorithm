import java.util.Optional;

public class etc {

    public static void main(String[] args) {

        ArrayTest arrayTest = new ArrayTest();
        arrayTest.add(1);
        arrayTest.add(2);

        Integer resultInteger1 = (Integer) arrayTest.get(0);
        Integer resultInteger2 = (Integer) arrayTest.get(1);

        System.out.println(resultInteger1 + resultInteger2); //integer Array test

        //몇 주 뒤........... 유지보수 중 String 으로 바꿔야할 일 생김
        arrayTest.add("1");
        arrayTest.add("2");

        Integer resultIntegerToString1 = (Integer) arrayTest.get(2);
        Integer resultIntegerToString2 = (Integer) arrayTest.get(3);

        System.out.println(resultIntegerToString1 + resultIntegerToString2); //integer Array test

    }


    static class ArrayTest {
        private int size;
        private static Object[] elements = new Object[5];

        public void add(Object value){
            elements[size++] =  value;
        }

        public Object get(int idx){
            return elements[idx];
        }
    }
}
