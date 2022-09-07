public class PgServiceResolver {
    public OrderPgData getOrderPgDataByPgType(String pgType, int productPrice, int paymentAmount) {
        OrderPgData orderPgData = new OrderPgData(pgType, productPrice, paymentAmount);
        //https://stackoverflow.com/questions/66807884/java-boolean-initialisation
        //https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5
        System.out.println("The orderPgData instance class member isPaymentAmountTampered is always initialized to "+orderPgData.getIsPaymentAmountTampered()+" by the Java compiler because it is not explicitly initialized in code.");
        
        switch(pgType) {
            case "card":
                System.out.println("In "+pgType+" payment logic, orderPgData does not verify whether the product amount and payment amount have been tampered with.");
                break;
            case "paypal":
                System.out.println("In "+pgType+" payment logic, orderPgData verifies whether the product amount and payment amount have been tampered with.");
                orderPgData.validateAmount();
                break;
        }

        return orderPgData;
    }
}
