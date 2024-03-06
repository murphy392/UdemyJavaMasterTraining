public class Main {
    public static void main(String[] args) {
        /*
        Create two methods with the same name: convertToCentimeters

        first method has one parameter of type int, which represents the entire height in inches.
        you'll convert inches to centimeters, in this method, and pass back the number of centimeters as a double

        the second method has two parameters of type int, one to represent height in feet, and one to represent the
        remaining height in inches. So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would
        be passed to this method. This method will convert feed and inches to just inches, the call the first method,
        to get the number of centimeters also returning the value as a double

        1 inch = 2.54 cm
        1 foot = 12 inch

        https://www.metric-conversions.org/length/feet-to-centimeters.htm
         */

        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int inches) {
        double centimeters;

        return centimeters = inches * 2.54d;
    }

    public static double convertToCentimeters(int feet, int inches) {
        double feetConvertedToCm = convertToCentimeters((feet * 12));
        double inchesConverted = convertToCentimeters(inches);

        return feetConvertedToCm + inchesConverted;

    }
}