package exercise2;

public class TriangleClassifier {
    public static String classifyTriangle(double a, double b, double c) {
        String result;

        if (!isTriangle(a, b, c)) {
            result = "not a triangle";
        } else {
            if (isThreeSideEqual(a, b, c)) {
                result = "equilateral triangle";
            } else if (isTwoSideEqual(a, b, c)) {
                result = "Isosceles triangle";
            } else {
                result = "normal triangle";
            }
        }

        return result;
    }

    private static boolean isTwoSideEqual(double a, double b, double c) {
        return a == b || b == c || c == a;
    }

    private static boolean isThreeSideEqual(double a, double b, double c) {
        return a == b && b == c;
    }

    private static boolean isTriangle(double a, double b, double c) {
        return Math.abs(a - b) < c && c < a + b;
    }
}
