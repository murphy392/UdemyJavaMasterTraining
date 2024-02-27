public class EndingChallenge {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        //putting firstValue + secondValue in parenthesis creates NO REMAINDER
        double total = firstValue + secondValue * 100.00;
        double remainder = total % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean remainderExists = (remainder == 0) ? true : false;
        System.out.println("Remainder exists? " + remainderExists);

        if (!remainderExists) {
            System.out.println("Got some remainder");
        }
    }
}
