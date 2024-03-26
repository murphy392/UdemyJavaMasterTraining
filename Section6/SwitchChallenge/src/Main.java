public class Main {
    public static void main(String[] args) {

        //use classic switch statement and capital letter values
        char callSign = 'A';

        switch (callSign) {
            case 'A':
                System.out.println(callSign + " = ABLE");
                break;
            case 'B':
                System.out.println(callSign + " = BAKER");
                break;
            case 'C':
                System.out.println(callSign + " = CHARLIE");
                break;
            case 'D':
                System.out.println(callSign + " = DOG");
                break;
            case 'E':
                System.out.println(callSign + " = EASY");
                break;
            default:
                System.out.println(callSign + " is not found");
        }

        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));

        System.out.println("==========================");

        System.out.println(printWeekDay(0));
        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));

    }

    /*
    1. create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values
        use the enhanced switch statement, to return the name of the day, based on the parameter passed.
        0 is sunday, 1 is monday, etc..

        use the enhanced switch statement as an expression, returning the result to a String named "dayOfTheWeek"

        print both the day variable and the dayOfTheWeek variable
    2. call the method for the values 0 - 7
    3. BONUS: Create a second method called printWeekDay, that uses an if-then-else statement, instead of a switch,
        to produce the same output
     */

    public static String printDayOfWeek(int day) {
        String dayOfTheWeek;
        return switch (day) {
            case 0 -> dayOfTheWeek = "Sunday";
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            default -> "Invalid Day";
        };
    }

    public static String printWeekDay(int day) {
        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else {
            return "Invalid Day";
        }
    }

}