package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static List<String> split(String originString) {
        if (originString.isEmpty()) {
            return new ArrayList<>();
        }

        return Arrays.asList(originString.split(","));
    }
}
