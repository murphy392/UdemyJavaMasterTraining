public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//    The cats spend most of the day playing. In particular, they play if the
//    temperature is between 25 and 35 (inclusive).
//    Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45) ) {
            return true;
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        }
        return false;
    }
}