package day21HashMap;

import java.util.HashMap;
import java.util.Map;

public class day21 {
    public static void main(String[] args) {
        HashMap<String, String> mapAB= new HashMap<>();
        // Modify and return the given map as follows: for this problem the map
        // may or may not contain the "a" and "b" keys. If both keys are present,
        // append their 2 string values together and store the result under the key "ab".


//            mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"};
//            mapAB({"a": "Hi"}) → {"a": "Hi"};
//            mapAB({"b": "There"}) → {"b": "There"}

        mapAB.put("a","Hi");
        mapAB.put("b","There");


        for(Map.Entry<String, String> i : mapAB.entrySet()) {

            if (mapAB.containsKey("a")&&mapAB.containsKey("b")){
                mapAB.get("a");
                mapAB.get("b");
                System.out.println(mapAB.get("a")+mapAB.get("b"));


            }

        }
    }
}
