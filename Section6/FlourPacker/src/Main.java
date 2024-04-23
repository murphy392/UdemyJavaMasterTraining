public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int bigKilos = 5 * bigCount;

        if (bigKilos + smallCount >= goal) {
            return smallCount >= goal % 5;
        }
        return false;
    }
}