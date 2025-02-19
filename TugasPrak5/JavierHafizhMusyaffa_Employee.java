package TugasPrak5;

class JavierHafizhMusyaffa_Employee implements JavierHafizhMusyaffa_Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private JavierHafizhMusyaffa_Invoice[] invoices;

    public JavierHafizhMusyaffa_Employee(int registrationNumber, String name, int salaryPerMonth, JavierHafizhMusyaffa_Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    //getters
    public int getRegistrationNumber() {return registrationNumber;}
    public String getName() {return name;}
    public int getSalaryPerMonth() {return salaryPerMonth;}
    public JavierHafizhMusyaffa_Invoice[] getInvoices() {return invoices;}

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (JavierHafizhMusyaffa_Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }
}