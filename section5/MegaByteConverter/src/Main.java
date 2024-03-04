public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        //1 mB = 1024 kB
        int megaBytes = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
        }
    }
}