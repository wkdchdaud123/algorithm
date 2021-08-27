package performance;

public class ReverseString {

    public static void main(String[] args) {
        String test = "wkdchdaud";
        char[] chars = new char[]{'w','k','d'};
        //System.out.println(new StringBuffer()..reverse().toString());

        System.out.println(new StringBuffer(String.valueOf(chars)).reverse().toString());
        System.out.println(new StringBuffer(test).reverse());

        int length = test.length();
        char[] result = new char[length];
        char[] charsTest = test.toCharArray();

        for (int i = 1; i < length+1; i++) {
            result[i-1] = charsTest[length-i];
        }

        System.out.println(String.valueOf(result));
        System.out.println(result.toString());

    }

}
