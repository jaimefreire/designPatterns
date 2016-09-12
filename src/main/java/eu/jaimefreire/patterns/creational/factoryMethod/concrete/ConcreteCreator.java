package eu.jaimefreire.patterns.creational.factoryMethod.concrete;

import eu.jaimefreire.patterns.creational.factoryMethod.interfaces.Creator;
import eu.jaimefreire.patterns.creational.factoryMethod.interfaces.ProductIf;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class ConcreteCreator implements Creator{
    @Override
    public ProductIf createProduct() {
        return new ConcreteProduct();
    }
}
