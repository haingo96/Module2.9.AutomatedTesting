package exercise3;

public class FizzBuzz {
    public static void main(String[] args) {
        checkFizzBuzz(58);
    }
    public static String checkFizzBuzz(int number) {
        String result;

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = toString(number);
        }

        return result;
    }

    public static String toString(int number) {
        String result = "";

        if (number < 10) {
            result = toStringLessThan10(number);
        } else if (number <= 19) {
            result = toString10_19(number);
        } else if (number < 100) {
            result = toString20_99(number);
        }

        return result;
    }

    private static String toString20_99(int number) {
        String result;
        char[] numberToCharArr = Integer.toString(number).toCharArray();

        int roundChar = Integer.parseInt(String.valueOf(numberToCharArr[0]));
        int unitChar = Integer.parseInt(String.valueOf(numberToCharArr[1]));

        if (number % 10 == 0) {
            result = toStringRoundNumber(roundChar);
        }else {
            result = toStringRoundNumber(roundChar) + " " + toStringLessThan10(unitChar);
        }

        return result;
    }

    private static String toStringRoundNumber(int roundChar) {
        String result = "";

        switch (roundChar) {
            case 2 -> result = "twenty";
            case 3 -> result = "thirty";
            case 4 -> result = "forty";
            case 5 -> result = "fifty";
            case 6 -> result = "sixty";
            case 7 -> result = "seventy";
            case 8 -> result = "eighty";
            case 9 -> result = "ninety";
        }

        return result;
    }

    private static String toString10_19(int number) {
        String result = "";

        switch (number) {
            case 10 -> result = "ten";
            case 11 -> result = "eleven";
            case 12 -> result = "twelve";
            case 13 -> result = "thirteen";
            case 14 -> result = "fourteen";
            case 15 -> result = "fifteen";
            case 16 -> result = "sixteen";
            case 17 -> result = "seventeen";
            case 18 -> result = "eighteen";
            case 19 -> result = "nineteen";
        }

        return result;
    }

    private static String toStringLessThan10(int number) {
        String result = "";
        switch (number) {
            case 0 -> result = "zero";
            case 1 -> result = "one";
            case 2 -> result = "two";
            case 3 -> result = "three";
            case 4 -> result = "four";
            case 5 -> result = "five";
            case 6 -> result = "six";
            case 7 -> result = "seven";
            case 8 -> result = "eight";
            case 9 -> result = "nine";
        }
        return result;
    }
}
