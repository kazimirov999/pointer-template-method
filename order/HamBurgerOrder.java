package main.order;

import main.order.orderPayment.OrderPayment;
import main.burger.HamBurger;

public class HamBurgerOrder extends BurgerOrderTemplate {

    private String paymentOption;

    public HamBurgerOrder(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    @Override
    void order() {
        System.out.println("Hamburger ordered");
    }

    @Override
    void addContent() {
        HamBurger hamBurger = new HamBurger();
        System.out.println(hamBurger.giveName() + " is added to the order");
    }

    @Override
    void cook() {
        System.out.println("Hamburger order is cooked");
    }

    @Override
    void serve() {
        System.out.println("Hamburger order is served");
    }

    @Override
    void pay() {
        OrderPayment burgerPayment = new OrderPayment();
        burgerPayment.pay(paymentOption);
    }
}
