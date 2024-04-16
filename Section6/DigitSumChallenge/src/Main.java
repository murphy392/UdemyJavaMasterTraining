public class Main {
    public static void main(String[] args) {
        /*
        write a method with the name sumDigits that has one int parameter called number
        if number >=10 process the number and return sum of all digits, otherwise return -1
        number 0-9 have 1 digit so we don't want to process them but want to return only that digit,
        also don't want to process negative numbers
        ex: sumDigits(125) = 8 (1+2+5=8)
         */
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10;
        }
        return sum;
    }
}