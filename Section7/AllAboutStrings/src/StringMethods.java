public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.printf("startingIndex = %d %n", startingIndex);
        System.out.printf("birthYear = %s %n", birthDate.substring(startingIndex));
        //Overloaded method that takes the starting and ending index
        System.out.println("month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.printf("newDate = %s %n", newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.printf("newDate = %s %n", newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.printf("newDate = %s %n", newDate);

        //method chaining is used below
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        //replacing characters
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
