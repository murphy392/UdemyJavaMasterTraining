public class Main {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        int check1 = (int) (n1 * 1000);
        int check2 = (int) (n2 * 1000);
        if (check1 - check2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}