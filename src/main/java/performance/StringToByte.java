package performance;

import org.w3c.dom.Node;

public class StringToByte {

    public static void main(String[] args) {

        String str = "12가";
        System.out.println(new String(str.getBytes(), 0, 6));
        for(byte b : "Z".getBytes()){
            System.out.println(b);
            //1011010
        }

        StringToByte stringToByte = new StringToByte();
        char c = 97;
        Character charr = 97;

        System.out.println(c);
        System.out.println(charr);

    }

}
