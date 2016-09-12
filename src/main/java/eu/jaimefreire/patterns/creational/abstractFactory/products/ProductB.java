package eu.jaimefreire.patterns.creational.abstractFactory.products;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProduct;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ProductB implements AbstractProduct {

    private String name = "";

    @Override
    public void action() {
        System.out.println(name);

    }

    public void setName(String myName) {
        this.name = myName;
    }

    @Override
    public String toString() {
        System.out.println(this.getClass().getName());
        return this.getClass().getName();
    }
}
