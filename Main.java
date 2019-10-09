package main;

import main.order.CheeseBurgerOrder;
import main.order.HamBurgerOrder;

public class Main {
    public static void main(String[] a) {

        CheeseBurgerOrder cheeseBurgerOrder = new CheeseBurgerOrder("card");
        cheeseBurgerOrder.processBurgerOrder();
        System.out.println();
        HamBurgerOrder hamBurgerOrder = new HamBurgerOrder("cash");
        hamBurgerOrder.processBurgerOrder();
    }
}
