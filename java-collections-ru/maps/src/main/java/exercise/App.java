package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (var i : words) {
            if (!result.containsKey(i)) {
                result.put(i, 1);
            } else {
                result.replace(i, result.get(i) + 1);
            }
        }
        if (sentence.length() == 0) {
            result.clear();
            return result;
        }
        return result;
    }
    public static String toString(Map map) {
        if (map.isEmpty()) {
            return "{}";
        }
        String result = "{\n";
        for (var key: map.keySet()) {
            result = result + "  " + key + ": " + map.get(key) + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
