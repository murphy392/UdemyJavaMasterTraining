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

        int secondTopScore = 95;
        //&& checks if BOTH sides are true
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //the || only needs ONE of the expressions to be true
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }

        /*
        Ternary Operator

        operand1 ? operand2 : operand3

        if operand1 is true, return operand2 else return operand 3

        STUDY THE ABOVE!!!
         */

        String makeOfCar = "Volkswagen";
        //makeOfCar == "Volkswagen" = operand1 | false = operand2 | true = operand3
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
