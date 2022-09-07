public class Main {
    public static void main(String[] args) {
        String pgType = "card"; // or paypal
        int productPrice = 100;
        int paymentAmount = 10;
        
        PgServiceResolver pgServiceResolver = new PgServiceResolver();
        OrderPgData orderPgData = pgServiceResolver.getOrderPgDataByPgType(pgType, productPrice, paymentAmount);
        finalizeOrder(orderPgData);
    }
    
    private static void finalizeOrder(OrderPgData orderPgData) {
        if (orderPgData.getIsPaymentAmountTampered()) {
            System.out.println("The hacker tampered with the payment amount, but product payment is canceled.");
        } else {
            if (orderPgData.getProductPrice() == orderPgData.getPaymentAmount()) {
                System.out.println("The hacker did not tamper with the payment amount, and product payment is completed.");
            } else {
                System.out.println("The hacker tampered with the payment amount, but product payment is completed.");
                System.out.println("If the variable is not explicitly initialized, the above vulnerability can occur.");
            }
        }
    }
}
