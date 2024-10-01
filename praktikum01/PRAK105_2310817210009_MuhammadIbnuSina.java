package praktikum01;

import java.util.Scanner;

public class PRAK105_2310817210009_MuhammadIbnuSina {
	    public static final double PHI = 3.14;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Masukkan jari-jari: ");
	        double jariJari1 = scanner.nextDouble();
	        System.out.print("Masukkan tinggi: ");
	        double tinggi1 = scanner.nextDouble();

	        double volume1 = hitungVolumeTabung(jariJari1, tinggi1);
	        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jariJari1, tinggi1, volume1);

	        System.out.print("\nMasukkan jari-jari: ");
	        double jariJari2 = scanner.nextDouble();
	        System.out.print("Masukkan tinggi: ");
	        double tinggi2 = scanner.nextDouble();

	        double volume2 = hitungVolumeTabung(jariJari2, tinggi2);
	        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jariJari2, tinggi2, volume2);
	    }

	    public static double hitungVolumeTabung(double jariJari, double tinggi) {
	        return PHI * jariJari * jariJari * tinggi;
	    }
	    
}