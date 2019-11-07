package day21HashMap;

import java.util.HashMap;
import java.util.Map;

public class homeworkHashMap2 {
    public static void main(String[] args) {
        // Modify and print the given map as follows:
        // if the key "a" has a value, set the key "b" to have that value,
        // and set the key "a" to have the value ""

        //{"a": "candy", "b": "dirt"} => "a": "", "b": "candy"
        //{"a": "candy"} => "a": "", "b": "candy"
        //{"a": "candy", "b": "carrot", "c": "meh"} => {"a": "", "b": "candy", "c": "meh"}
        HashMap<String,String> map = new HashMap<>();

        map.put("a","candy");
        map.put("b","dirt");

        for(Map.Entry<String,String> i: map.entrySet()){
            if(map.get("a")!=""){
                map.put("b",map.get("a"));

            }
            System.out.println(map);
        }
    }
}
