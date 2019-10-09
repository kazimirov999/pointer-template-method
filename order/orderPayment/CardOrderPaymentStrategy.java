package main.order.orderPayment;

class CardOrderPaymentStrategy implements OrderPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Order is payed with card");
    }
}
