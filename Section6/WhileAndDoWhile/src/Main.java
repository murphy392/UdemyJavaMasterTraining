public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbers++;
            if (evenNumbers >= 5) {
                System.out.println(evenNumbers);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}