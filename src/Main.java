import java.util.Scanner;

/**
 * A simple program to calculate the power of a number.
 */
public class Main {

    /**
     * The main method where the program starts execution.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        double hasil = hitungPangkat(angka, pangkat);

        System.out.println(angka + " ^ " + pangkat + " = " + hasil);
    }

    /**
     * Calculates the power of a number.
     *
     * @param angka  The base number.
     * @param pangkat The exponent (power) to which the base is raised.
     * @return The result of raising the base to the power of the exponent.
     */
    private static double hitungPangkat(double angka, int pangkat) {
        double hasil = 1;

        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }

        return hasil;
    }
}
