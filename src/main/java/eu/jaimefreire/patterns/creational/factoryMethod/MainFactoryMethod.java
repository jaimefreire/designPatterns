package eu.jaimefreire.patterns.creational.factoryMethod;

import eu.jaimefreire.patterns.creational.factoryMethod.concrete.ConcreteCreator;
import eu.jaimefreire.patterns.creational.factoryMethod.concrete.ConcreteProduct;
import eu.jaimefreire.patterns.creational.factoryMethod.interfaces.Creator;
import eu.jaimefreire.patterns.creational.factoryMethod.interfaces.ProductIf;
import org.junit.Assert;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class MainFactoryMethod {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();

        ProductIf product = creator.createProduct();

        Assert.assertTrue("Product must be of class ConcreteProduct", product instanceof ConcreteProduct);
    }

}
