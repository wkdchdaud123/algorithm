package performance;

public class StringTest {

    public static void main(String[] args) {
        String test = "";
        System.out.println(test.getClass().hashCode()); //String 클래스 주소 자체는 한번 생성될터니 클래스 주소는 같지
        System.out.println(test.getClass());
        System.out.println(System.identityHashCode(test)); // 다르겠지 매번
        test = "1";
        System.out.println(test.getClass().hashCode());
        System.out.println(test.getClass());
        System.out.println(System.identityHashCode(test));
        test = "1" + "2";
        System.out.println(test.getClass().hashCode());
        System.out.println(test.getClass());
        System.out.println(System.identityHashCode(test));


        String testSum = ""
            + "1"
            + "2";

        String testSum2 = ""
            + "1"
            + "2";

        String testSum3 = "12";

        System.out.println(testSum.getClass().hashCode());
        System.out.println(System.identityHashCode(testSum));
        System.out.println(testSum2.getClass().hashCode());
        System.out.println(System.identityHashCode(testSum2));
        System.out.println(testSum3.getClass().hashCode());
        System.out.println(System.identityHashCode(testSum3));

        String testSum4 = "12345678910";
        System.out.println(testSum4.getClass().hashCode());
        System.out.println(System.identityHashCode(testSum4));
    }

}
