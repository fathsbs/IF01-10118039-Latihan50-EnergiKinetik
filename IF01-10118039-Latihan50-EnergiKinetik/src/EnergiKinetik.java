/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menghitung energi kinetik sebuah bola  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class EnergiKinetik {

    private int massa;
    private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double volume(int massa) {
        double volume = (massa * massa * massa) * 0.001;
        return volume;
    }

    public double energiKinetik(int massa, int kecepatan) {
        double EK = (massa * kecepatan * kecepatan * 0.5) / 1000;
        return EK;
    }

    public double usaha() {
        double usaha = (energiKinetik(massa, kecepatan) - energiKinetik(massa, 0));
        return usaha;
    }
}
