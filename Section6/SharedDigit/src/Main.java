public class Main {
    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 > 99) || (num1 < 10) || num2 > 99 || num2 < 10) {
            System.out.println(true);
            return false;
        }
        int num2backup = num2;
        while (num1 != 0) {
            int check = num1 % 10;
            while (num2 != 0) {
                int check2 = num2 % 10;
                if (check2 == check) {
                    System.out.println("Check = " + check);
                    System.out.println("Check2 = " + check2);
                    return true;
                }
                num2 /= 10;
            }
            num1 /=10;
            num2 = num2backup;
        }
        return false;
    }
}