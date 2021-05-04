package utils;

public class ValidationUtils {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MAX_LENGTH = 5;

    public static boolean validName(String name) {
        return !name.trim().isEmpty() && name.length() <= MAX_LENGTH;
    }

    public static boolean validNumber(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER;
    }
}
