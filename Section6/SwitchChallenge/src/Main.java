public class Main {
    public static void main(String[] args) {

        char callSign = 'A';

        switch (callSign) {
            case 'A':
                System.out.println(callSign + " = ABLE");
                break;
            case 'B':
                System.out.println(callSign + " = BAKER");
                break;
            case 'C':
                System.out.println(callSign + " = CHARLIE");
                break;
            case 'D':
                System.out.println(callSign + " = DOG");
                break;
            case 'E':
                System.out.println(callSign + " = EASY");
                break;
            default:
                System.out.println(callSign + " not found");
        }
    }
}