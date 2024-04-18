public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /*
    Greatest Common Divisor
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each of the integers
(i.e. without leaving a remainder).
     */

//    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10 ) {
//            return -1;
//        }
//
//        //find the smallest number
//        int divisor = Math.min(first,second);
//
//        //take the smallest number, iterate while greater than 0, reduce by one
//        for (int i = divisor; i > 0; i--) {
//            //take the smallest number and see if you get a remainder of 0. If not reloop until the
//            //GCD is found. Assign divisor and return divisor
//            if ((first % i == 0) && (second % i ==0)){
//                divisor = i;
//                System.out.println(divisor);
//                break;
//            }
//        }
//
//        return divisor;
//    }
    //instructor solution
    public class GreatestCommonDivisor {

        public static int getGreatestCommonDivisor(int first, int second) {

            if (first < 10 || second < 10) {
                return -1;
            }

            int min = first < second ? first : second;
            int gcd = 1;
            for (int j = 1; j <= min; j++) {
                if (first % j == 0 && second % j == 0) {
                    gcd = j;
                }
            }
            return gcd;
        }
    }

}