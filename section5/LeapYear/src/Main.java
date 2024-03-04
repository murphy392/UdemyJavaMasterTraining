public class Main {
    public static void main(String[] args) {
        //System.out.println(isLeapYear(-1600)); //return false as it's out of range
        //System.out.println(isLeapYear(1600)); //return true
        //System.out.println(isLeapYear(2017)); //return false
        System.out.println(isLeapYear(2000)); //return true
        System.out.println(isLeapYear(2024));

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <=9999 ) {
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
}
