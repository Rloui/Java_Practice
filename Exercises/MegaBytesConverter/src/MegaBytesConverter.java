public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = kiloBytes / 1024;
        System.out.println("megaBytes: " + megaBytes);

        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println("remaining kilo bytes: " + remainingKiloBytes);

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
