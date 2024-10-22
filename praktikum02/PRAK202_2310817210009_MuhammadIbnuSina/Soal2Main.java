package PRAK202_2310817210009_MuhammadIbnuSina;

		public class Soal2Main {
		    public static void main(String[] args){
		        Kopi kopi1 = new Kopi();
		        kopi1.menuKopi = "Espresso";
		        kopi1.ukuranGelas = "Medium";
		        kopi1.harga = 25000;

		        kopi1.info();
		        kopi1.setNamaPembeli("Alice");
		        System.out.println("Pembeli Kopi	: " +kopi1.getNamaPembeli());
		        System.out.println("Pajak Kopi	: Rp. " +kopi1.getPajakPembelian());
	}

}
