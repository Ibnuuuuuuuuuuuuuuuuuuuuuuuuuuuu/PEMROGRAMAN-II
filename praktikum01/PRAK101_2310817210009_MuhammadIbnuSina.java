package praktikum01;

import java.util.Scanner;

public class PRAK101_2310817210009_MuhammadIbnuSina{
	public static void main(String[] args) {
		 Scanner inputan = new Scanner(System.in);

	        System.out.print("Masukkan Nama Lengkap: ");
	        String namaPanjang = inputan.nextLine();
	        
	        System.out.print("Masukkan Tempat Lahir: ");
	        String tempatKelahiran = inputan.nextLine();
	        
	        System.out.print("Masukkan Tanggal Lahir: ");
	        byte tanggalKelahiran = inputan.nextByte();
	        
	        System.out.print("Masukkan Bulan Lahir: ");
	        int bulanKelahiran = inputan.nextInt();
	        
	        System.out.print("Masukkan Tahun Lahir: ");
	        int tahunLahir = inputan.nextInt();
	        
	        System.out.print("Masukkan Tinggi Badan (cm): ");
	        short tinggiBadan = inputan.nextShort();
	        
	        System.out.print("Masukkan Berat Badan (kg): ");
	        double beratBadan = inputan.nextDouble();

	        String[] namaNamaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
	        String bulanNama = namaNamaBulan[bulanKelahiran - 1];  

	        System.out.println("\nOutput:");
	        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n", namaPanjang, tempatKelahiran, tanggalKelahiran, bulanNama, tahunLahir);
	        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram\n", tinggiBadan, beratBadan);
	        
	        inputan.close();

	}

}
