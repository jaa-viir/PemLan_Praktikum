package TugasPrak1;

public class Mobil {
    private String NoPol;
    private int Tahun;
    private String Warna;
    private double HargaSewa;
    
    public Mobil(String NoPol, int Tahun, String Warna, double HargaSewa) {
        this.NoPol = NoPol;
        this.Tahun = Tahun;
        this.Warna = Warna;
        this.HargaSewa = HargaSewa;
    }
    
    public void Kondisi() {
        System.out.println("Kondisi Mobil Bagus");
    }
    public double TotalHargaSewa(int hari) {
        return hari * HargaSewa;
    }
    public String toString(){
        return "Avanza (NoPolisi: " + NoPol + " Tahun Mobil:"  + Tahun + " Warna Mobil: " 
        + Warna + " Harga Sewa: Rp" + HargaSewa + ")";
    }
}
