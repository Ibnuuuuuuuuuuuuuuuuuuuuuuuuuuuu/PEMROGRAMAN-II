package PRAK203_2310817210009_MuhammadIbnuSina;

public class Soal3Main { 
    public static void main(String[] args) { 
        Pegawai p1 = new Pegawai(); 
        // baris bawah error disebabkan karena tidak ada titik koma (;) di akhir line
        // p1.nama = "Roi" 
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin"); 
        p1.umur = 17; // menambahkan inisialisasi angka 17 agar saat output tidak keluar angka 0
 
        System.out.println("Nama         : " + p1.getNama()); 
        System.out.println("Asal         : " + p1.getAsal()); 
        System.out.println("Jabatan      : " + p1.jabatan); 
        // Menambah kata "tahun" pada akhir untuk menyesuaikan pada output soal dan sebagai kejelasan angka 17 sebagai umur
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur         : " + p1.umur + " tahun"); 
    } 
}
