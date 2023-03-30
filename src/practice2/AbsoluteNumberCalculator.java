package practice2;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        int result = 0;
        if (number >= 0) {
            result = number;
        } else if (number < 0) {
            result = -number;
        }
        return result;
    }
}
