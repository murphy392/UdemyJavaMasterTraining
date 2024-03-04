public class Main {
    public static void main(String[] args) {
        /*
        parameter - definition shown in the method call
        argument - what is PASSED in the method call


         */
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        //pass the "parameters" into the call as "arguments" when making the method call
        //arguments MUST be passed in the same order they are declared in the method parameters
        calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true,1000,8,200);
    }
    //add parameters into the method call to remove the need for local method variables
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //commented out below for passing in the "arguments"
        //The "arguments" allow the method to know what to work with and are in "local" Scope. Quotes added to bring ATTENTION
        //to detail
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
        }
    }
}