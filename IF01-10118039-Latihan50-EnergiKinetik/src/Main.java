/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menghitung energi kinetik sebuah bola  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatan(25);

        System.out.println("         ===Energi Kinetik===");
        System.out.printf("Massa \t\t\t\t: %d g%n", ek.getMassa());
        System.out.printf("Kecepatan \t\t\t: %d m/s%n", ek.getKecepatan());
        System.out.printf("Volume \t\t\t\t: %.3f m3%n", ek.volume(ek.getMassa()));
        System.out.printf("Energi Kinetik \t\t\t: %.4f J%n", ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
        System.out.printf("Usaha dimulai dari keadaan diam : %.4f J%n", ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));

    }

}
