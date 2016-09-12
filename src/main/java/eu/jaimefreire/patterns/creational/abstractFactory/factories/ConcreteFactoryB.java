package eu.jaimefreire.patterns.creational.abstractFactory.factories;

import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractFactoryIF;
import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProduct;
import eu.jaimefreire.patterns.creational.abstractFactory.products.ProductB;

/**
 * Created by jaimefreire on 11.09.16.
 */
public class ConcreteFactoryB implements AbstractFactoryIF {

    @Override
    public AbstractProduct createProduct(String nameAbstractProduct) {
        ProductB product = new ProductB();
        product.setName(nameAbstractProduct);
        return product;
    }
}
