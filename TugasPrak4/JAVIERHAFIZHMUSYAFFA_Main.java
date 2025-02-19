package TugasPrak4;

public class JAVIERHAFIZHMUSYAFFA_Main {
    public static void main(String[] args) {
        JAVIERHAFIZHMUSYAFFA_Kue[] daftarKue = new JAVIERHAFIZHMUSYAFFA_Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 10.0, 1);
        daftarKue[1] = new KueJadi("Cheesecake", 25.0, 7);
        daftarKue[2] = new KueJadi("Kue Lapis", 15.0, 5);
        daftarKue[3] = new KuePesanan("Lapis Legit", 37.5, 2);
        daftarKue[4] = new KueJadi("Cupcake", 5.0, 6);
        daftarKue[5] = new KueJadi("Kue Bolu", 6.25, 4);
        daftarKue[6] = new KuePesanan("Kue Mangkok", 30.0, 3);
        daftarKue[7] = new KueJadi("Brownies", 10.0, 10);
        daftarKue[8] = new KuePesanan("Kue Talam", 20.0, 2.5);
        daftarKue[9] = new KuePesanan("Kue Lumpur", 22.5, 2);
        daftarKue[10] = new KueJadi("Kue Sus", 8.75, 8);
        daftarKue[11] = new KuePesanan("Kue Klepon", 25.0, 2);
        daftarKue[12] = new KueJadi("Kue Nastar", 3.75, 12);
        daftarKue[13] = new KueJadi("Kue Macaron", 11.25, 9);
        daftarKue[14] = new KuePesanan("Kue Putu", 27.5, 2.5);
        daftarKue[15] = new KuePesanan("Kue Serabi", 32.5, 2.5);
        daftarKue[16] = new KuePesanan("Kue Apem", 17.5, 3);
        daftarKue[17] = new KueJadi("Kue Pukis", 7.5, 7);
        daftarKue[18] = new KuePesanan("Kue Tiramisu", 35.0, 2);
        daftarKue[19] = new KuePesanan("Kue Sus", 15.0, 1.5);



        // A. Tampilkan semua kue beserta jenisnya
        System.out.println("+=--------------------------=+[Daftar Kue]+=---------------------------=+");
        for (int i = 0; i < daftarKue.length; i++) {
            String jenisKue = daftarKue[i].getClass().getSimpleName();
            if (jenisKue.equals("KuePesanan")) jenisKue = "Kue pesanan\t";
            else if (jenisKue.equals("KueJadi")) jenisKue = "Kue jadi   \t";
            System.out.println("| "+(i+1) + ". " + jenisKue + ": " + daftarKue[i] + "\t|");
        }
        System.out.println("+=---------------------------------------------------------------------=+\r\n");

        // B. Hitung total harga semua jenis kue
        double totalHarga = 0;
        for (JAVIERHAFIZHMUSYAFFA_Kue loopKueB : daftarKue) {
            totalHarga += loopKueB.hitungHarga();
        }
        System.out.println("B.) Total Harga Semua Jenis Kue\t: " + totalHarga  + "k\r\n");

        // C. Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (JAVIERHAFIZHMUSYAFFA_Kue loopKueC : daftarKue) {
            if (loopKueC instanceof KuePesanan) {
                totalHargaPesanan += loopKueC.hitungHarga();
                totalBeratPesanan += ((KuePesanan) loopKueC).getBerat();
            }
        }
        System.out.println("C.) 1. Total Harga Kue Pesanan\t: " + totalHargaPesanan + "k");
        System.out.println("    2. Total Berat Kue Pesanan\t: " + totalBeratPesanan + " Kg\r\n");

        // D. Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (JAVIERHAFIZHMUSYAFFA_Kue loopKueD : daftarKue) {
            if (loopKueD instanceof KueJadi) {
                totalHargaJadi += loopKueD.hitungHarga();
                totalJumlahJadi += ((KueJadi) loopKueD).getJumlah();
            }
        }
        System.out.println("D.) 1. Total Harga Kue Jadi\t: " + totalHargaJadi + "k");
        System.out.println("    2. Total Jumlah Kue Jadi\t: " + totalJumlahJadi + " buah\r\n");

        // E. Tampilkan informasi kue dengan harga terbesar
        JAVIERHAFIZHMUSYAFFA_Kue hargaTerbesar = daftarKue[0];
        for (int i = 1; i < daftarKue.length; i++) {
            if (daftarKue[i].hitungHarga() > hargaTerbesar.hitungHarga()) {
                hargaTerbesar = daftarKue[i];
            }
        }
        System.out.println("E.) Kue dengan harga terbesar\t: " + hargaTerbesar.getNama() + ", dengan harga Rp." + hargaTerbesar.hitungHarga() + "k\r\n");
    }
}
