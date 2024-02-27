public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Craig");

        boolean isAlien = false;

        //best recommended to use a code block even though it can work without the block
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topScore = 80;

        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        //&& checks if BOTH sides are true
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
