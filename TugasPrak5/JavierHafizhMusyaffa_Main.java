package TugasPrak5;

import java.util.Scanner;

public class JavierHafizhMusyaffa_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("+=--------------------[Start Terminal]----------------------=+");
        String employeeName = "Javier"; //ganti disini buat nama employee
        System.out.println("welcome, "+ employeeName + "!");
        System.out.print("Berapa banyak produk yang ingin Anda beli?\r\n > ");
        int nProduk = in.nextInt();
        in.nextLine(); 

        if (nProduk>=1) System.out.println("+=---------------------[Input Produk]-----------------------=+");
        JavierHafizhMusyaffa_Invoice[] invoices = new JavierHafizhMusyaffa_Invoice[nProduk];
        for (int i = 0; i < nProduk; i++) {
            System.out.println("Masukkan informasi untuk produk ke-" + (i + 1) + " :");
            System.out.print("Nama Produk :\r\n > ");
            String productName = in.nextLine();
            System.out.print("Kuantitas:\r\n > ");
            int quantity = in.nextInt();
            System.out.print("Harga per item:\r\n > ");
            int pricePerItem = in.nextInt();
            invoices[i] = new JavierHafizhMusyaffa_Invoice(productName, quantity, pricePerItem);
            in.nextLine();
            if (i < nProduk-1){
                System.out.println ("+=----------------------------------------------------------=+");
            }
        }

        System.out.println("+=--------------------[Detail Karyawan]---------------------=+");
        JavierHafizhMusyaffa_Employee employee = new JavierHafizhMusyaffa_Employee(400111012, employeeName, 4000000, invoices);
        System.out.println("Nama\t\t: " + employee.getName());
        System.out.println("Nomor Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Gaji Per Bulan\t: Rp " + employee.getSalaryPerMonth());

        if (nProduk>=1) System.out.println("+=--------------------[Detail Belanja]----------------------=+");
        int i = 1;
        for (JavierHafizhMusyaffa_Invoice invoice : employee.getInvoices()) {
            System.out.println(i+". "+invoice.getProductName()+" ( Harga per item : Rp."+invoice.getPricePerItem()+
            ", kuantitas : "+invoice.getQuantity()+", Total harga : Rp."+invoice.getPayableAmount()+" )");
            i++;
        }

        System.out.println("+=----------------------------------------------------------=+");
        if (nProduk>=1) {
            System.out.println("Total Gaji Setelah Dipotong Belanjaan: Rp " + employee.getPayableAmount());
            System.out.println("+=----------------------------------------------------------=+");
        }
        in.close();
    }
}