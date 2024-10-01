package praktikum01;
import java.util.Scanner;

public class PRAK102_2310817210009_MuhammadIbnuSina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" MASUKKAN ANGKA: ");
        int angkaYangDimasukkan = scanner.nextInt();

        int count = 0;
        int angka = angkaYangDimasukkan;

        while (count < 11) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5) - 1 + " ");
            } else {
                System.out.print(angka + " ");
            }
            angka++;
            count++;
        }
        
        scanner.close();
    }
}
