package TugasPrak1;

public class Sopir {
    private String Nama;
    private String SIM;
    private String Alamat;
    private double GajiHarian;
    public Sopir(String Nama, String SIM, String Alamat, double GajiHarian) {
        this.Nama = Nama;
        this.SIM = SIM;
        this.Alamat = Alamat;
        this.GajiHarian = GajiHarian;
    }
    public void Tujuan(String Tujuan) {
        System.out.println("Sopir Sedang dalam perjalanan ke " + Tujuan);
    }
    public void CekSIM() {
        System.out.println("Sopir Memiliki SIM A");
    }
    public double HitungGaji() {
        return GajiHarian;
    }
    public String toString() {
        return "Sopir [nama: " + Nama + ", SIM: " + SIM + ", alamat: " + Alamat + ", gaji Harian: " + GajiHarian + "]";
    }
}
