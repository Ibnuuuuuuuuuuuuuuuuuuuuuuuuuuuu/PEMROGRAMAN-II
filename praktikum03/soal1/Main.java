package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> listDadu = new LinkedList<>();

        System.out.println();
        int jumlahDadu = scanner.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            listDadu.add(new Dadu());
        }
        int totalNilai = 0;
        for (int i = 0; i < listDadu.size(); i++) {
            int nilaiDadu = listDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
            totalNilai += nilaiDadu;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        scanner.close();
    }
}