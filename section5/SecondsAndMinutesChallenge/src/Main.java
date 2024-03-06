public class Main {
    public static void main(String[] args) {
        /*
        create a method that takes time, represented in seconds as the parameter
        then, transform the seconds into hours
        next, display the time in hours, with the remaining minutes and seconds in a string

        two methods called getDurationString
        first: one parameter of type int, named seconds. This method calls the second to return it's results
        second: two parameters, named minutes and seconds. both ints
        both methods return a String: XXh YYm ZZs

        1 min = 60 sec
        1 hr = 60 min or 3600 sec

        Bonus:
        Use validation
        first method: seconds parameter should be >= 0
        second method: minutes parameter should be >=0, & seconds parameter should be >=0 and <=59
        if either method is passed an invalid value, print out some type of meaningful message to the user.
         */

        System.out.println(getDurationString(60, 59));
        getDurationString(3945);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0){
            return "Invalid Value";
        }
        if (seconds >= 60) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            getDurationString(seconds, minutes);
        } else {
            System.out.println("0h " + "0m " + seconds + "s");
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds, int minutes) {
        if ((minutes < 0) || ((seconds < 0) || seconds > 59 )) {
            return "Invalid Value";
        }

        if (minutes >= 60) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        } else {
            System.out.println("0h " + minutes + "m " + seconds + "s");
        }
        return "Invalid Value";
    }

}