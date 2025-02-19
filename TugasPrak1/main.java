package TugasPrak1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("N 3169 LE", 2020, "Hitam",500000);
        Sopir sopir = new Sopir("Erlang Eka Permata", "C", "Jl. Mekarsari No. 553", 200000);
        Pelanggan pelanggan = new Pelanggan("1234568", "Javier Hafizh M", "Jl. Bendungan Tangga no. 14");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(
                "+-----------=+ Menu utama +=-----------+\r\n"+
                "Masukkan angka opsi yang ingin dibuka :\r\n"+
                "1. Detail anda\r\n"+
                "2. Detail pemesanan\r\n"+
                "3. Detail sopir\r\n"+
                "tekan \"9\" untuk keluar menu"
            );
            System.out.print("+--------------------------------------+\r\n" + "> ");
            int opsi = in.nextInt();
            System.out.println("+--------------------------------------+");
            switch (opsi) {
                case 1: // anda/pelanggan
                String Informasi = pelanggan.InformasiPelanggan(); 
                System.out.println(Informasi); 
                break;

                case 2: // order
                pelanggan.StatusPesanan(": aktif"); 
                pelanggan.Pesanan(mobil, sopir, 5); 
                double HargaSewa = mobil.TotalHargaSewa(3);
                System.out.println("Harga Sewa untuk 3 hari " + HargaSewa);
                break;

                case 3: // sopir
                sopir.Tujuan("Pantai");
                sopir.CekSIM(); 
                mobil.Kondisi();
                double salary = sopir.HitungGaji(); 
                System.out.println("Gaji Harian: " + salary); 
                break;

                case 9:
                System.out.println("Terimakasih telah memilih layanan kami.");
                in.close();
                return;

                default:
                System.out.println("input angka dari tabel diatas");
                break;
            }
        }
    }
}
