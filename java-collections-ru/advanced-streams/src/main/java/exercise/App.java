package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        String[] lines = config.split("\n");
        return Arrays.stream(lines)
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(kv -> kv.startsWith("X_FORWARDED_"))
                .map(kv -> kv.replaceFirst("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
