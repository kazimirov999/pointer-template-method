package main.order.orderPayment;

class CashOrderPaymentStrategy implements OrderPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Order is payed in cash");
    }
}
