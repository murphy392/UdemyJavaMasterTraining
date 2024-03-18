public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long yy = minutes / 525600;
            long zz = ((minutes % 525600) / 60)/24;

            System.out.println(minutes + " min = " + yy + " y and " + zz + " d" );
        }


    }
}