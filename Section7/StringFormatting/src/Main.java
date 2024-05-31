public class Main {
    public static void main(String[] args) {
        //Pre java 15 way
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Second Point";

        System.out.println(bulletIt);

        //Java 15 and up
        String textBlock = """
                Print a bulleted List: 
                        \u2022 First Point
                            \u2022 Second Point""";

        System.out.println(textBlock);

        //System.out.printf and System.out.format do the same
        int age = 35;
        //%d is expecting data and will be replaced with what is passed. It is a format specifier
        //%d is for a decimal integer
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        //%2f -> precision set to two decimal points
        System.out.printf("Your age is %2f%n", (float)age);

        //set number width
        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        //formatted String
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}