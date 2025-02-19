package TugasPrak3;

public class JAVIERHAFIZHMUSYAFFA_Main {
    public static void main(String[] args) {
        // Nomor 1 //
        System.out.println("+=------=[ Testcase  nomor 1 ]=------=+\r\n");
        System.out.println(" A. laki-laki sudah menikah");
        JAVIERHAFIZHMUSYAFFA_Manusia a = new JAVIERHAFIZHMUSYAFFA_Manusia("A", "111", true, true);
        System.out.println(a+"\r\n");
        System.out.println(" B. perempuan sudah menikah");
        JAVIERHAFIZHMUSYAFFA_Manusia b = new JAVIERHAFIZHMUSYAFFA_Manusia("B", "111", false, true);
        System.out.println(b+"\r\n");
        System.out.println(" C. laki-laki belum menikah");
        JAVIERHAFIZHMUSYAFFA_Manusia c = new JAVIERHAFIZHMUSYAFFA_Manusia("C", "111", true, false);
        System.out.println(c+"\r\n");
    
        // Nomor 2 //
        System.out.println("+=------=[ Testcase  nomor 2 ]=------=+\r\n");
        System.out.println(" A. Ipk < 3 ");
        JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM d = new JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM("235150400111012", 2.9, "Javier Hafizh Musyaffa", "111", true, false);
        System.out.println(d+"\r\n");
        System.out.println(" B. Ipk 3 - 3.5 ");
        JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM e = new JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM("235150400111012", 3.3, "Javier Hafizh Musyaffa", "111", true, false);
        System.out.println(e+"\r\n");
        System.out.println(" C. Ipk 3.5 - 4 ");
        JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM f = new JAVIERHAFIZHMUSYAFFA_MahasiswaFILKOM("235150400111012", 3.7, "Javier Hafizh Musyaffa", "111", true, false);
        System.out.println(f+"\r\n");
    
        // Nomor 3 //
        System.out.println("+=------=[ Testcase  nomor 3 ]=------=+\r\n");
        System.out.println(" A. Lama bekerja 2 tahun, anak 2 (lk, menikah)");
        JAVIERHAFIZHMUSYAFFA_Pekerja g = new JAVIERHAFIZHMUSYAFFA_Pekerja(1000, 2022, 3, 2, 2, "G", "111", true, true);
        System.out.println(g+"\r\n");
        System.out.println(" B. Lama bekerja 6 tahun (lk, menikah)");
        JAVIERHAFIZHMUSYAFFA_Pekerja h = new JAVIERHAFIZHMUSYAFFA_Pekerja(1000, 2015, 3, 2, 0, "H", "111", true, true);
        System.out.println(h+"\r\n");
        System.out.println(" B. Lama bekerja 20 tahun, anak 10 (lk, menikah)");
        JAVIERHAFIZHMUSYAFFA_Pekerja i = new JAVIERHAFIZHMUSYAFFA_Pekerja(1000, 2004, 3, 2, 10, "I", "111", true, true);
        System.out.println(i+"\r\n");

        // Nomor 4 //
        System.out.println("+=------=[ Testcase  nomor 4 ]=------=+\r\n");
        System.out.println(" A. Lama bekerja 15 tahun, gaji $75000 (lk, menikah)");
        JAVIERHAFIZHMUSYAFFA_Manager J = new JAVIERHAFIZHMUSYAFFA_Manager("HRD", 7500, 2009, 1, 2, 3, "J", "111", true, true);
        System.out.println(J+"\r\n");
    }
}