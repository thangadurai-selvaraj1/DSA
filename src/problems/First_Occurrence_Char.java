package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * First occurrence of a character in a string
 * Time Complex - O(n-1)
 * Space Complex - O(n)
 */
public class First_Occurrence_Char {

    public static String firstOccurrence(String a) throws Exception {
        if (a.length() <= 1) {
            throw new Exception("Not Valid Input");
        }
        HashMap<Character, Character> map = new HashMap<>() {
        };
        map.put(a.charAt(0), a.charAt(0));
        for (int i = 1; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                return String.valueOf(a.charAt(i));
            } else {
                map.put(a.charAt(i), a.charAt(i));
            }
        }
        return "Not found";
    }
}
