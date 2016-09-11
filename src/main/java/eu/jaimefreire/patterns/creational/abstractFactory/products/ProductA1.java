package eu.jaimefreire.patterns.creational.abstractFactory.products;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProductAIF;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ProductA1 extends AbstractProductAIF {
    @Override
    public void actionA() {
        System.out.println(this.getClass().getName());

    }
}
