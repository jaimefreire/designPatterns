package eu.jaimefreire.patterns.creational.abstractFactory.products;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProduct;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ProductA implements AbstractProduct {

    final String name;

    //Constructor
    public ProductA(final String myName)
    {
        name = myName;
    }

    @Override
    public String toString() {
        System.out.println(this.getClass().getName());
        return(this.getClass().getName());
    }

    @Override
    public void action() {
        System.out.println(name);

    }
}

