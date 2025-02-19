package TugasPrak2;
import java.util.*;
public class PinjamanOnline{
    Scanner in = new Scanner(System.in);
    public PinjamanOnline(String Nama){
        this.nama = Nama;
    }

    private static Double SaldoSistem = 5000000.0;
    public static Double getSaldoSistem() {
        return SaldoSistem;
    }
    
    public static void setSaldoSistem(Double saldoSistem) {
        SaldoSistem = saldoSistem;
    }

    private String nama;    
    private Double pinjaman = 0.0;
        public void setPinjaman(Double pinjaman) {
            this.pinjaman = pinjaman;
        }
        public Double getPinjaman() {
            return pinjaman;
        }
    private int lamaPeminjaman = 0;
        public void setLamaPeminjaman(int lamaPeminjaman) {
            this.lamaPeminjaman = lamaPeminjaman;
        }
        public int getLamaPeminjaman() {
            return lamaPeminjaman;
        }

    public void pinjam() {
        System.out.println("Selamat datang, " + nama);
        System.out.println("Silahkan masukkan nominal uang yang ingin dipinjam :");
        double pinjaman = in.nextDouble();
        in.nextLine();
        System.out.println("Silahkan masukkan lama peminjaman :");
        int lama = in.nextInt();
        in.nextLine();
    
        if (getSaldoSistem() < pinjaman){
            System.out.println("Maaf, nominal yang anda masukkan terlalu besar");
        }
        else if (getPinjaman() > 0){
            System.out.println("Maaf, anda masih belum melunasi pinjaman anda sebelumnya");
        }
        else {
            setPinjaman(pinjaman);
            setLamaPeminjaman(lama);
            setSaldoSistem(getSaldoSistem() - pinjaman);
            System.out.println("Pinjaman anda telah berhasil");
        }
        System.out.println("==================================================");
        return;
    }

    public void kembalikan () {
        System.out.println("Selamat datang, " + nama );
        System.out.println("Silahkan masukkan nominal uang yang ingin dikembalikan :");
        double nominal = in.nextDouble();
        in.nextLine();
        System.out.println("Silahkan masukkan hari pengembalian :");
        int hariKe = in.nextInt();
        in.nextLine();
    
        if (getPinjaman() == 0) {
            System.out.println("Anda belum memiliki pinjaman");
        } 
        else if (hariKe > getLamaPeminjaman()){
            double denda = (hariKe - getLamaPeminjaman()) * 15000;
            if (nominal >= getPinjaman() + denda) {
                System.out.println("Terima kasih " + nama + " telah melunasi peminjaman");
                setSaldoSistem(getSaldoSistem() + nominal);
                setPinjaman(0.0);
            }
            else{
                System.out.println(
                    "Terima kasih " + nama + " telah melakukan cicilan" +
                    "\r\n Anda masih memiliki tanggungan sebesar : "+ (getPinjaman() + denda - nominal));
                setSaldoSistem(getSaldoSistem() + nominal);
                setPinjaman(getPinjaman() + denda - nominal);
            }
        }
        else {
            if (nominal >= getPinjaman()) {
                System.out.println("Terima kasih " + nama + " telah melunasi peminjaman");
                setSaldoSistem(getSaldoSistem() + nominal);
                setPinjaman(0.0);
            }
            else{
                System.out.println(
                    "Terima kasih " + nama + " telah melakukan cicilan" +
                    "\r\nAnda masih memiliki tanggungan sebesar : "+ (getPinjaman() - nominal));
                setSaldoSistem(getSaldoSistem() + nominal);
                setPinjaman(getPinjaman() - nominal);
            }
        }
        System.out.println("==================================================");
    }

    public void printInfo() {
        System.out.println("Nama: " + nama +
        "\r\nLama Peminjaman: " + lamaPeminjaman + " hari" + 
        "\r\nNominal Pinjaman: Rp " + pinjaman +
        "\r\n--------------------------------------------");
    }
}