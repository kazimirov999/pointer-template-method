package main.order;

abstract class BurgerOrderTemplate {


    abstract void order();

    abstract void addContent();

    abstract void cook();

    abstract void serve();

    abstract void pay();


    public final void processBurgerOrder() {

        order();
        addContent();
        cook();
        serve();
        pay();

    }


}
