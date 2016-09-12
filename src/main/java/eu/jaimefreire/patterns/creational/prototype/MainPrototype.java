package eu.jaimefreire.patterns.creational.prototype;

import eu.jaimefreire.patterns.creational.prototype.interfaces.PrototypeIF;
import eu.jaimefreire.patterns.creational.prototype.products.ConcretePrototype1;
import eu.jaimefreire.patterns.creational.prototype.products.PrototypeCreator;
import eu.jaimefreire.patterns.creational.prototype.products.abstractProduct.Prototype;
import org.junit.Assert;

/**
 * Created by jaimefreire on 12.09.16.
 *
 *  -- Implementation of the Prototype pattern
 *
 * */
public class MainPrototype {

    public static void main(String[] args) {

        //Only referring to product Interface
        PrototypeIF prototype = PrototypeCreator.createPrototype(new ConcretePrototype1());

        System.out.println("Prototype built! ");
        System.out.println("Prototype info: " + prototype.getPrototypeInfo());
        Assert.assertTrue("Prototype object instance is not correct", prototype instanceof ConcretePrototype1);

    }

}
