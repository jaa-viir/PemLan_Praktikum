package TugasPrak1;

public class Pelanggan {
    private String NoKTP;
    private String Nama;
    private String Alamat;

    public Pelanggan(String NoKTP, String Nama, String Alamat) {
        this.NoKTP = NoKTP;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public void Pesanan(Mobil mobil, Sopir sopir, int hari){
        System.out.println("Memesan Travel untuk " + hari + " Hari menggunakan " + mobil);
        System.out.println( "dan " + sopir);
    }

    public String InformasiPelanggan() {
        return "Informasi Pelanggan: \r\n" + NoKTP + ", \r\n" + Nama + ", \r\n" + Alamat;
    }

    public void StatusPesanan(String Pesanan){
        System.out.println("Status Pesanan " + Pesanan);
    }
}
    