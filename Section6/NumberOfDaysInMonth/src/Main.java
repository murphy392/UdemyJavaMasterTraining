public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2024));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> {
                    if (isLeapYear(year)) {
                        yield 29;
                    } else yield 28;
                }
                default -> 30;
            };
        }else {
            return -1;
        }
    }
}