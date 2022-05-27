package Sets_Maps_Iterator;

import java.util.HashSet;
import java.util.Set;

public class App_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Drums");
        set.add("Guitars");
        set.add("Guitars");
        set.add("Bass");

        System.out.println(set.size());

//        HashSet have only unique values.

        boolean y = set.contains("Bass");
        System.out.println(y);

    }
}
