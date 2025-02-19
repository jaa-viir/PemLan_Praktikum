package TugasPrak3;

import java.time.LocalDate;
import java.time.Period;

public class JAVIERHAFIZHMUSYAFFA_Pekerja extends JAVIERHAFIZHMUSYAFFA_Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak; 

    // Gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // tahun masuk
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    // jumlah anak
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public JAVIERHAFIZHMUSYAFFA_Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, Boolean jenisKelamin, Boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk =  LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus(){
        LocalDate tanggalSekarang = LocalDate.now();
        Period selisih = Period.between(tahunMasuk, tanggalSekarang);
        int selisihTahun = selisih.getYears();
        
        if (selisihTahun>=0 && selisihTahun<5) return (gaji*5/100);
        else if (selisihTahun>=5 && selisihTahun<=10) return (gaji*10/100);
        else  return (gaji*15/100);
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak*20);
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() +  getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\r\ngaji\t\t\t= $" + getGaji() + 
        "\r\ntahun masuk\t\t= " + tahunMasuk + 
        "\r\njumlahAnak\t\t= " + getJumlahAnak();
    }    
}
