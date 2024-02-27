public class EndingChallenge {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double total = (firstValue + secondValue) * 100.00;
        double remainder = total % 40.00;
        boolean remainderExists = (remainder == 0) ? true : false;
        System.out.println("Remainder value " + remainderExists);

        if (!remainderExists) {
            System.out.println("Got some remainder");
        }
    }
}
