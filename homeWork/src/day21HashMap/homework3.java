package day21HashMap;

import java.util.HashMap;
import java.util.Map;

public class homework3 {
    public static void main(String[] args) {
        //    Given an array of non-empty strings,
//    create and return a Map<String, String> as follows:
//    for each string add its first character as a key with
//    its last character as the value.

//    ["code", "bug"] → {"b": "g", "c": "e"}
//    ["man", "moon", "main"] → {"m": "n"}
//    ["man", "moon", "good", "night"] → {"g": "d", "m": "n", "n": "t"}
//

        String[] strings = {"man", "moon", "good", "night"};

        Map<String, String> map = new HashMap();
        for (String s:strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }

        System.out.println(map);

    }
}
