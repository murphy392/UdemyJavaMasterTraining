public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int add = 0;

        while (number != 0) {
            if (number % 2 == 0) {
                add = number % 10;
                sum = sum + add;
            }
            number /= 10;
        }

        return sum;
    }
}