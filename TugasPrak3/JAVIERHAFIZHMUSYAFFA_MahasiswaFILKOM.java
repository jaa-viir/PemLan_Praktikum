package TugasPrak3;

public class JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM extends JAVIERHAFIZHMUSYAFFA_Manusia {
    private String nim;
    private double ipk;

    // NIM
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    // IPK
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Konstruktor
    public JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM(String nim, double ipk, String nama, String nik, Boolean jenisKelamin, Boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus(){
        String angkatan1234; //ini keseluruhan
        int angkatan34; //ini buat yang dari nim
        String programStudi;
    
        angkatan34 = Integer.parseInt(nim.substring(0,2)); //ini jujur ribet
        if (angkatan34>=63) angkatan1234 = 19 + Integer.toString(angkatan34); //tahun berdiri ub 1963, bwt manusia sepuh
        else angkatan1234 = 20 + Integer.toString(angkatan34);
    
        switch (Integer.parseInt(nim.substring(6,7))) {
            case 2:
                programStudi = "Teknik Informatika";
                break;
            case 3:
                programStudi = "Teknik Komputer";
                break;
            case 4:
                programStudi = "Sistem Informasi";
                break;
            case 6:
                programStudi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                programStudi = "Teknologi Informasi";
                break;
            default:
                programStudi = "tidak diketahui";
                break;
        }
        return programStudi+", "+angkatan1234;
    }

    public double getBeasiswa(){
        if (ipk>=3.0 && ipk<= 3.5) return 50;
        else if (ipk>=3.5 && ipk<=4) return 75;
        else return 0;  
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBeasiswa();
    }
    @Override
    public String toString() {  
        return super.toString() + 
        "\r\nnim\t\t\t= " + nim + 
        "\r\nipk\t\t\t= " + ipk + 
        "\r\nstatus\t\t\t: " + getStatus();
    }
}
