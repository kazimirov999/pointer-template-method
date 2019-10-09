package main.order.orderPayment;

public class OrderPayment {

    public void pay(String paymentOption) {
        if (OrderPaymentOptions.CARD.equals(OrderPaymentOptions.valueOf(paymentOption.toUpperCase()))) {
            new CardOrderPaymentStrategy().pay();
        } else if (OrderPaymentOptions.CASH.equals(OrderPaymentOptions.valueOf(paymentOption.toUpperCase()))) {
            new CashOrderPaymentStrategy().pay();
        } else {
            System.out.println("No such option");
        }
    }
}

