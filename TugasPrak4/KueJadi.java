package TugasPrak4;

class KueJadi extends JAVIERHAFIZHMUSYAFFA_Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
}
