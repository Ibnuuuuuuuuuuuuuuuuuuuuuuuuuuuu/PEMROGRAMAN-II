package PRAK203_2310817210009_MuhammadIbnuSina;

//baris dibawah merupakan baris yang membuat error karena nama class tidak sesuai dengan nama file yang "pegawai", maka harus disamakan
//public class Employee {
public class Pegawai {
  public String nama;

  // baris akan error jika menggunakan char tipe data yang tidak sesuai, maka diubah jadi string
  //public char asal;
  public String asal;
  public String jabatan;
  public int umur;

  public String getNama(){
      return nama;
  }

  public String getAsal(){
      return asal;
  }

  //baris dibawah akan error akibat parameter tidak ada untuk method menerimanya, maka ditambahakn "j" sebagai parameter
  //public void setJabatan(){
  public void setJabatan(String j){
      this.jabatan = j;
  }
}
