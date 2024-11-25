package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int jumlahNegara = scanner.nextInt();
            scanner.nextLine();

            LinkedList<Negara> listNegara = new LinkedList<>();

            for (int i = 1; i <= jumlahNegara; i++) {
                String namaNegara = scanner.nextLine();
                String jenisKepemimpinan = scanner.nextLine();
                String namaPemimpin = scanner.nextLine();
                int tanggalKemerdekaan = 0;
                int bulanKemerdekaan = 0;
                int tahunKemerdekaan = 0;

                if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                    tanggalKemerdekaan = scanner.nextInt();
                    bulanKemerdekaan = scanner.nextInt();
                    tahunKemerdekaan = scanner.nextInt();
                    scanner.nextLine(); 
                }

                Negara negara = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
                listNegara.add(negara);
            }

            for (Negara negara : listNegara) {
                System.out.print("Negara " + negara.getNama() + " mempunyai ");
                switch (negara.getJenisKepemimpinan().toLowerCase()) {
                    case "monarki":
                        System.out.println("Raja bernama " + negara.getNamaPemimpin());
                        break;
                    case "presiden":
                        System.out.println("Presiden bernama " + negara.getNamaPemimpin());
                        System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan());
                        break;
                    case "perdana menteri":
                        System.out.println("Perdana Menteri bernama " + negara.getNamaPemimpin());
                        System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan());
                        break;
                    default:
                        System.out.println("pemimpin tidak dikenal bernama " + negara.getNamaPemimpin());
                        break;
                }
                System.out.println(); 
            }
        }
    }
}
