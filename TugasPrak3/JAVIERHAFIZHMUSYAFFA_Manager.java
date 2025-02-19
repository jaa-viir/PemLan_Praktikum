package TugasPrak3;

public class JAVIERHAFIZHMUSYAFFA_Manager extends JAVIERHAFIZHMUSYAFFA_Pekerja {
    private String department;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public JAVIERHAFIZHMUSYAFFA_Manager(String department, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, Boolean jenisKelamin, Boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin,  menikah);
        this.department = department;
    }

    @Override   
    public double getTunjangan() {
        return super.getTunjangan()+(getGaji()*10/100);
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\r\ndepartmen\t\t= " + department;
    }   
}
