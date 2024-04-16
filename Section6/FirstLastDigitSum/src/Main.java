public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-109));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum, last = 0;
        int first = number % 10;
        while (number != 0) {
            if (number % 10 != 0) {
                last = number % 10;
            }
            number /= 10;
        }
        sum = first + last;
        return sum;
    }
}