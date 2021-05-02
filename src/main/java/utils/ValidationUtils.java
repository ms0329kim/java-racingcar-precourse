package utils;

public class ValidationUtils {
    private static final int MAX_LENGTH = 5;

    public static boolean validName(String name) {
        return !name.isEmpty() && name.length() <= MAX_LENGTH;
    }
}
