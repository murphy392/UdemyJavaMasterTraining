public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if (isTeen(n1)) {
            return true;
        }else if(isTeen(n2)) {
            return true;
        } else return isTeen(n3);
    }

    public static boolean isTeen (int n1) {
        return n1 >= 13 && n1 <= 19;
    }
}