public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = Math.abs(number);
        number = Math.abs(number);
        while (number !=0 || number > 0) {
           int holder = 0;
           holder = number % 10;
           reverse *= 10;
           reverse += holder;
           number = number / 10;
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }
}