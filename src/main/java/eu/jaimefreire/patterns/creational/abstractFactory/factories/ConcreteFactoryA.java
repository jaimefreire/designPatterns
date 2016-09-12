package eu.jaimefreire.patterns.creational.abstractFactory.factories;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractFactoryIF;
import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProduct;
import eu.jaimefreire.patterns.creational.abstractFactory.products.ProductA;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ConcreteFactoryA implements AbstractFactoryIF {

    @Override
    public AbstractProduct createProduct(String nameAbstractProductA) {
        return new ProductA(nameAbstractProductA);
    }

}
