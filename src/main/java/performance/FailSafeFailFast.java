package performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FailSafeFailFast {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(); collection.add("1"); collection.add("2"); collection.add("3"); collection.add("4"); collection.add("5"); Iterator iterator = collection.iterator(); int i = 0; while (iterator.hasNext()) { String element = (String) iterator.next(); i++; if (i == 3) { iterator.remove(); // collection.remove(element);
             }
            System.out.println("value is" + element); }
        System.out.println("collection is " + collection);




}

}
