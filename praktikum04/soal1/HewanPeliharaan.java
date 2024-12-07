package soal1;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama, ras;
    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    
    public static HewanPeliharaan scanHewan() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();

        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        
        return new HewanPeliharaan(nama, ras);
    }
    
    void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}