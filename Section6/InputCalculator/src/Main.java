import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0d;
        int count = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                avg = (double) sum/count;
                break;
            }
            count++;
            scanner.nextLine();
        }

        long average = Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}