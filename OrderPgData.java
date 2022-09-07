public class OrderPgData {
    String PgType;
    int productPrice;
    int paymentAmount;
    private boolean isPaymentAmountTampered;

    public OrderPgData(String PgType, int productPrice, int paymentAmount) {
        this.PgType = PgType;
        this.productPrice = productPrice;
        this.paymentAmount = paymentAmount;
    }
    
    public void setIsPaymentAmountTampered(boolean isPaymentAmountTampered) {
        this.isPaymentAmountTampered = isPaymentAmountTampered;
    }
    
    public boolean getIsPaymentAmountTampered() {
        return this.isPaymentAmountTampered;
    }

    public int getProductPrice() {
        return this.productPrice;
    }
    
    public int getPaymentAmount() {
        return this.paymentAmount;
    }

    public void validateAmount() {
        if (this.productPrice == this.paymentAmount) {
            this.setIsPaymentAmountTampered(false);
            System.out.println("isPaymentAmountTampered is changed to "+this.getIsPaymentAmountTampered()+"."); 
        } else {
            this.setIsPaymentAmountTampered(true);
            System.out.println("isPaymentAmountTampered is changed to "+this.getIsPaymentAmountTampered()+".");
        }
    }
}
