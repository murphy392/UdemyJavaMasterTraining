import java.util.Scanner;

public class Main {
    /*
    Read 5 valid numbers from the console, entered by the user and print the sum of those five numbers

    Check for valid integers. If not valid print out "Invalid Number" and continue looping, until you do have 5 valid numbers

    Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count

    Hints: use a while or do while loop, use a scanner object and parseInt(), and use the nextLine() method
    Use local variables to keep track of the counter and for the sum
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        String number = "";

        while (counter <= 5) {
            System.out.println("Enter number #" + counter +":");
            number = scanner.nextLine();
            if (validateNumber(number)) {
                sum  =  sum + Integer.parseInt(number);
                counter++;
            }
        }

        scanner.close();
        System.out.println("Sum = " + sum);
    }

    public static boolean validateNumber(String number) {
        try {
            if (Integer.parseInt(number) < Integer.MAX_VALUE && Integer.parseInt(number) > Integer.MIN_VALUE) {
                return true;
                }
            } catch(NumberFormatException e){
                System.out.println("Invalid Number");
                return false;
            }
        return false;
    }
}