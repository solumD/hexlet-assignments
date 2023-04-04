package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.*;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> cutEmails = new ArrayList<>();
        for (String email : emails) {
            cutEmails.add(email.substring(email.indexOf("@") + 1));
        }
        System.out.println(cutEmails);
        long k = cutEmails.stream()
                .filter(user -> user.equals("gmail.com") || user.equals("yandex.ru") || user.equals("hotmail.com"))
                .count();

        return k;
    }
}
// END
