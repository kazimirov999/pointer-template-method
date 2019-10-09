package main.order;

import main.burger.CheeseBurger;
import main.order.orderPayment.OrderPayment;

public class CheeseBurgerOrder extends BurgerOrderTemplate {

    private String paymentOption;

    public CheeseBurgerOrder(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    @Override
    void order() {
        System.out.println("Cheeseburger ordered");
    }

    @Override
    void addContent() {
        CheeseBurger cheeseBurger = new CheeseBurger();
        System.out.println(cheeseBurger.giveName() + " is added to the order");
    }

    @Override
    void cook() {
        System.out.println("Cheeseburger order is cooked");
    }

    @Override
    void serve() {
        System.out.println("Cheeseburger order is served");
    }

    @Override
    void pay() {
        OrderPayment burgerPayment = new OrderPayment();
        burgerPayment.pay(paymentOption);
    }


}
