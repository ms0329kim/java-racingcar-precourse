package utils;

public class NumberUtils {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    public static int randomNumber() {
        return (int) (Math.random() * MAX_NUMBER + MIN_NUMBER);
    }
}
