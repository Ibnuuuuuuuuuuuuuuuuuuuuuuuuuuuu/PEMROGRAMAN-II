package PRAK201_2310817210009_MuhammadIbnuSina;

public class Soal1Main {
    public static void main(String[] args) {
        BuahYangDijual apel = new BuahYangDijual("Apel", 0.4, 7000.0, 40);
        BuahYangDijual mangga = new BuahYangDijual("Mangga", 0.2, 3500.0, 15);
        BuahYangDijual alpukat = new BuahYangDijual("Alpukat", 0.25, 10000.0, 12);

        apel.informasiHargaBuah();
        mangga.informasiHargaBuah();
        alpukat.informasiHargaBuah();
    }
}