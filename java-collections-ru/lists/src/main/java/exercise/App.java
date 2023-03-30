package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

// BEGIN
class App {
    public static boolean scrabble(String symbs, String word) {
        char[] lits = symbs.toLowerCase().toCharArray();
        char[] bk = word.toLowerCase().toCharArray();
        List<String> listsymbs = new LinkedList<>();
        List<String> listword = new LinkedList<>();
        for (var i : lits) {
            listsymbs.add(Character.toString(i));
        }
        for (var i : bk) {
            listword.add(Character.toString(i));
        }
        List<String> listletters = new ArrayList<>(listsymbs);
        List<String> word2 = new ArrayList<>(listword);
        for (String i : listletters) {
            if (word2.contains(i)) {
                word2.remove(i);
            }
        }
        if (listletters.isEmpty()) {
            return false;
        }
        if (word2.isEmpty()) {
            return true;
        }
        return false;
    }
}


//END
