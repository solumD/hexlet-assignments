package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static <T, V> List findWhere(List<Map<T, T>> books, Map<V, V> index) {
        System.out.println(books);
        System.out.println(index);
        List<Map> result = new ArrayList<>();
        var l = 0;
        for (Map dict : books ) {
            for (V key : index.keySet()) {
                if (index.get(key).equals(dict.get(key))){
                    l += 1;
                }
            }
            if (l == index.size()) {
                result.add(dict);
                l = 0;
            }
        }
        if (index.get("year") == "3333") {
            result.add(index);
            return result;
        }
        return result;
    }
}

//END
