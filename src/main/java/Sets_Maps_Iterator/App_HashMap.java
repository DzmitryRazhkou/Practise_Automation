package Sets_Maps_Iterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App_HashMap {
    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Washington D.C.", "USA");
        capitals.put("Moscow", "Russia");
        capitals.put("Kiev", "Ukraine");
        capitals.put("Toronto", "Canada");
        capitals.put("London", "United Kingdom");
        capitals.put("London", "Great Britain");
        System.out.println(capitals);

//        Keys are unique, values - not.

        System.out.println(capitals.get("Toronto"));


//        If we know a key, we'll get a value.






        Map<Integer, String> cymbals = new HashMap<>();
        cymbals.put(1, "Paiste");
        cymbals.put(2, "Sabian");
        cymbals.put(3, "Zildjian");
        cymbals.put(4, "Meiln");
        System.out.println(cymbals);

        System.out.println(cymbals.get(0));



//        Iteration by Keys.

        Set<String> Cap_ = capitals.keySet();
        for (String k: Cap_){
            System.out.println(k);


//            Or

            for (String h: capitals.keySet()){
                System.out.println(h);
            }
        }

//        Iteration by Values.

        Collection<String> Cap = capitals.values();
        for (String v: Cap){
            System.out.println(v);
        }

//        Iteration by Keys/Values.

        for (Map.Entry<String, String> e: capitals.entrySet()){
            System.out.println(e);
        }


    }
}
