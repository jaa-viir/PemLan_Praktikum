package TugasPrak2;

public class Main {
    public static void main(String[] args) {
        // // Skenario 1
        // PinjamanOnline akun11 = new PinjamanOnline("Dani");
        // PinjamanOnline akun12 = new PinjamanOnline("Bagus");
        // PinjamanOnline akun13 = new PinjamanOnline("Vania");

        // akun11.pinjam();
        // akun12.pinjam();
        // akun12.kembalikan();
        // akun11.kembalikan();
        // akun13.pinjam();
        // akun12.pinjam();
        // akun11.kembalikan();
        // akun13.pinjam();

        // System.out.println(
        //     "\r\n\033[32m+=------------------------------------------=+\033[0m" +
        //     "\r\nInformasi transaksi - skenario 1");
        //     akun11.printInfo();
        //     akun12.printInfo();
        //     akun13.printInfo();
        // System.out.println("Saldo sistem seknario 1 : " + PinjamanOnline.getSaldoSistem() +
        //     "\r\n\033[32m+=------------------------------------------=+\033[0m\r\n");


        // // Skenario 2
        // PinjamanOnline.setSaldoSistem(5000000.); //set ulang default
        // PinjamanOnline akun21 = new PinjamanOnline("Tia");
        // PinjamanOnline akun22 = new PinjamanOnline("Fira");
        // PinjamanOnline akun23 = new PinjamanOnline("Ani");

        // akun21.pinjam();
        // akun22.kembalikan();
        // akun22.pinjam();
        // akun21.kembalikan();
        // akun23.pinjam();
        // akun21.kembalikan();

        // System.out.println(
        //     "\r\n\033[32m+=------------------------------------------=+\033[0m" +
        //     "\r\nInformasi transaksi - skenario 2");
        //     akun21.printInfo();
        //     akun22.printInfo();
        //     akun23.printInfo();
        // System.out.println("Saldo sistem seknario 2 : " + PinjamanOnline.getSaldoSistem() +
        //     "\r\n\033[32m+=------------------------------------------=+\033[0m\r\n");

        // Skenario 3
        PinjamanOnline.setSaldoSistem(5000000.); //set ulang default
        PinjamanOnline akun31 = new PinjamanOnline("Ana");
        PinjamanOnline akun32 = new PinjamanOnline("Doni");
        PinjamanOnline akun33 = new PinjamanOnline("Ikhsan");
        PinjamanOnline akun34 = new PinjamanOnline("Adi");

        akun31.pinjam();
        akun32.pinjam();
        akun33.pinjam();
        akun33.kembalikan();
        akun31.kembalikan();
        akun34.pinjam();
        akun34.kembalikan();
        akun33.pinjam();
        akun32.pinjam();
        akun32.kembalikan();
        akun33.kembalikan();
        akun32.pinjam();

        System.out.println(
            "\r\n\033[32m+=------------------------------------------=+\033[0m" +
            "\r\nInformasi transaksi - skenario 3");
            akun31.printInfo();
            akun32.printInfo();
            akun33.printInfo();
            akun34.printInfo();
        System.out.println("Saldo sistem seknario 3 : " + PinjamanOnline.getSaldoSistem() +
            "\r\n\033[32m+=------------------------------------------=+\033[0m\r\n");
    }
}

