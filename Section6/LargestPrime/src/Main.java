public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    /*
    Write a method named getLargestPrime with one parameter of type int named number.

    If the number is negative or does not have any prime numbers, the method should return -1 to indicate
    an invalid value.

    The method should calculate the largest prime factor of a given number and return it.
     */

    public static int getLargestPrime(int number) {
        int highest = number;
        if (number <= 0) {
            return -1;
        }

        for (int i = 2; i <= number; i++){
            if (number % i == 0) {
                highest = i;
            }

        }

        return highest;
    }

    /*
    Instructor Code:
         public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
     */
}