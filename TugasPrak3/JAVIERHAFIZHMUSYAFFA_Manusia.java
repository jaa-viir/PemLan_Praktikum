package TugasPrak3;
public class JAVIERHAFIZHMUSYAFFA_Manusia {
    private String nama;
    private Boolean jenisKelamin;
    private String nik;
    private Boolean menikah;

    // NAMA
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // JENIS KELAMIN
    public String getJenisKelamin() {
        if (jenisKelamin==true){
            return "laki-laki";
        }
        else {
            return "perempuan";
        }
    }
    public void setJenisKelamin(Boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // NIK
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    // MENIKAH??
    public String getMenikah() {
        if (menikah==true) return "kawin";
        else return "belum kawin";
        }
    public void setMenikah(Boolean menikah) {
        this.menikah = menikah;
    }


    public JAVIERHAFIZHMUSYAFFA_Manusia(String nama, String nik, Boolean jenisKelamin, Boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan (){
        if (menikah==true){
            if (jenisKelamin==true) return 25;
            else return 20;
        }
        else return 15;
    }

    public double getPendapatan (){
        return getTunjangan();
    }

    public String toString() {
        return "nama\t\t\t= " + getNama() + 
        "\r\nnik\t\t\t= " + getNik() + 
        "\r\njenis Kelamin\t\t= " + getJenisKelamin() + 
        "\r\njumlah pendapatan\t= $" + getPendapatan();
    }
}