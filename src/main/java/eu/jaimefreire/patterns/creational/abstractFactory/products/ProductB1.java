package eu.jaimefreire.patterns.creational.abstractFactory.products;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProductBIF;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ProductB1 extends AbstractProductBIF {
    @Override
    protected void actionB() {
        System.out.println(this.getClass().getName());
    }
}
