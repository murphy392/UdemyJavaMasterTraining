public class Main {
    public static void main(String[] args) {
        //what are 100 miles in kilometers. The below expression evaluates that
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; // add bonus points
        }

        //expressions include assignments and evaluations. They do not include the keywords or semicolons
        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        /*
        the next video is about whitespace and indenting. There WILL NOT be a "Java Project" for that video as
        I am already familiar with that java coding concept.
         */
    }
}