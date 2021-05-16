public class GenericLimitForNumber<T extends Number>{

    private static Object[] elements = new Object[5];
    private int size;

    public void add(T value){
        elements[size++] = value;
    }

    public T get(int idx) {
        return (T) elements[idx];
    }
    public static <T extends CharSequence> void printFirstChar(T param) {
        System.out.println(param.charAt(0));

    }

}
