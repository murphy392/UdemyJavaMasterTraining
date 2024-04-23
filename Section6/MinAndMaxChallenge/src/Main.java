import java.util.Scanner;

public class Main {
    /*
    Use an endless loop that:
        prompts the user to enter a number, or any character to quit
        Validates the user-entered data really is a number, you can choose either an Integer, or double validation
        If the user-entered data is not a number, quit the loop
        Keep track of the min and max number entered
    If the user has previously entered a set of numbers (or even just one), display the min and max number that was entered
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "1";
        int comparator;
        int min = 0;
        int max = 0;
        int count = 0;
        boolean cont = true;

        while (cont) {
            System.out.println("Please enter a number: ");
            number = scanner.nextLine();
            cont = inputValidation(number);
            if (inputValidation(number)){
                comparator = Integer.parseInt(number);
                if (count == 0 || comparator < min) {
                    min = comparator;
                }
                if (count == 0 || comparator > max) {
                    max = comparator;
                }
            }
            count++;

        }

        if (count > 0) {
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        } else {
            System.out.println("No numbers entered");
        }


    }

    public static boolean inputValidation(String number) {
        try {
            if (Integer.parseInt(number) < Integer.MAX_VALUE && Integer.parseInt(number) > Integer.MIN_VALUE) {
                return true;
            }
        } catch(NumberFormatException e){
            return false;
        }
        return false;
    }
}