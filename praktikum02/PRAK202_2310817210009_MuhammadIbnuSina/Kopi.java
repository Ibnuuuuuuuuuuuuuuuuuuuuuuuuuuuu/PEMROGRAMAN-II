package PRAK202_2310817210009_MuhammadIbnuSina;

public class Kopi {
	    String menuKopi, ukuranGelas, atasNamaPembelian;
	    double harga;
	    
	    public void setNamaPembeli(String atasNamaPembelian){
	        this.atasNamaPembelian = atasNamaPembelian;
	    }
	    public double getPajakPembelian(){
	        return harga * 0.11;
	    }
	    public String getNamaPembeli(){
	        return atasNamaPembelian;
	    }
	    
	    public void info(){
	        System.out.println("Nama Kopi	: " +menuKopi);
	        System.out.println("Ukuran		: " +ukuranGelas);
	        System.out.println("Harga		: Rp. " +harga);
	    }
}
