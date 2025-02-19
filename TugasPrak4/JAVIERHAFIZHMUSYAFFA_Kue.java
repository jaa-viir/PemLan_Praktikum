package TugasPrak4;

abstract class JAVIERHAFIZHMUSYAFFA_Kue {
    private String nama;
    private double harga;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public JAVIERHAFIZHMUSYAFFA_Kue(String nama, double harga) {
        setNama(nama);
        setHarga(harga);
    }

    abstract double hitungHarga();

    public String toString() {
        return "Nama = " + nama + ",       \tHarga: " + hitungHarga() + "k";
    }
}

