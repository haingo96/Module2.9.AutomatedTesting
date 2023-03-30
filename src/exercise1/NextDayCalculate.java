package exercise1;

public class NextDayCalculate {
    public static int[] calculateNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (isLeapYear(year) && month == 2 && day == 28) {
            nextDay = 29;
        } else if (isEndOfMonth(day, month, year)) {
            nextDay = 1;
            nextMonth = month + 1;
        } else if (isEndOfYear(day, month)) {
            nextDay = 1;
            nextMonth = 1;
            nextYear = year + 1;
        } else {
            nextDay = day + 1;
        }

        int[] result = {nextDay, nextMonth, nextYear};

        return result;
    }

    private static boolean isEndOfYear(int day, int month) {
        boolean result = false;

        if (month == 12 && day == 31) {
            result = true;
        }

        return result;
    }

    private static boolean isEndOfMonth(int day, int month, int year) {
        boolean result = false;

        switch (month) {
            case 1, 3, 5, 7, 8, 10:
                if (day == 31) result = true;
                break;
            case 4, 6, 9, 11:
                if (day == 30) result = true;
                break;
            case 2:
                if (!isLeapYear(year) && day == 28 || isLeapYear(year) && day == 29) result = true;
        }

        return result;
    }

    private static boolean isLeapYear(int year) {
        boolean result = false;

        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 100 == 0 && year % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
