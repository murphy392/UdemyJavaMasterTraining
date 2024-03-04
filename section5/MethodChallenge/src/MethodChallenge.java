public class MethodChallenge {
    public static void main(String[] args) {
        String name = "Craig";
        int score = 1500;

        displayHighScorePosition(name, calculateHighScorePosition(score));

        int highScorePosition = calculateHighScorePosition(1000);
        name = "Bob";
        displayHighScorePosition(name, highScorePosition);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 ) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list!");
    }
}