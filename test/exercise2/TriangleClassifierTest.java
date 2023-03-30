package exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifyTriangle2_2_2() {
        double a = 2;
        double b = 2;
        double c = 2;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "equilateral triangle";

        assertEquals(expected, actual);
    }

    @Test
    void classifyTriangle2_2_3() {
        double a = 2;
        double b = 2;
        double c = 3;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "Isosceles triangle";

        assertEquals(expected, actual);
    }

    @Test
    void classifyTriangle3_4_5() {
        double a = 3;
        double b = 4;
        double c = 5;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "normal triangle";

        assertEquals(expected, actual);
    }

    @Test
    void classifyTriangle8_2_3() {
        double a = 8;
        double b = 2;
        double c = 3;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "not a triangle";

        assertEquals(expected, actual);
    }

    @Test
    void classifyTriangle_Neg1_2_1() {
        double a = -1;
        double b = 2;
        double c = 1;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "not a triangle";

        assertEquals(expected, actual);
    }

    @Test
    void classifyTriangle0_1_1() {
        double a = 0;
        double b = 1;
        double c = 1;

        String actual = TriangleClassifier.classifyTriangle(a, b, c);
        String expected = "not a triangle";

        assertEquals(expected, actual);
    }

}