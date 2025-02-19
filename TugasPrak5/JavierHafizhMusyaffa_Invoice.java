package TugasPrak5;

class JavierHafizhMusyaffa_Invoice implements JavierHafizhMusyaffa_Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public JavierHafizhMusyaffa_Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // getter
    public String getProductName() {return productName;}
    public int getQuantity() {return quantity;}
    public int getPricePerItem() {return pricePerItem;}

    @Override
    public double getPayableAmount() {return quantity * pricePerItem;}

}