package eu.jaimefreire.patterns.creational.prototype.products;

import eu.jaimefreire.patterns.creational.prototype.interfaces.PrototypeIF;
import eu.jaimefreire.patterns.creational.prototype.products.markerInterfaces.Buildable;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class PrototypeCreator {

    //Method to create a prototype on any class that is Prototypeable
    public static PrototypeIF createPrototype(Buildable buildablePrototype)
    {
        return buildablePrototype.buildPrototype();
    }
}
