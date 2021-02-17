public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.twoMilesPerHour(10.5);
        System.out.println("miles= " + miles);

        SpeedConverter.printConversion(10.5);
    }

}
