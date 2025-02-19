package TugasPrak4;

class KuePesanan extends JAVIERHAFIZHMUSYAFFA_Kue {
    private double berat;

    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        setBerat(berat);;
    }

    @Override
    double hitungHarga() {
        return getHarga() * getBerat();
    }

}
