package eu.jaimefreire.patterns.creational.prototype.products.markerInterfaces;

import eu.jaimefreire.patterns.creational.prototype.interfaces.PrototypeIF;

/**
 * Created by jaimefreire on 12.09.16.
 */
public interface Buildable {

    //Generic prototype attributes, shared for all
    public PrototypeIF preparePrototype();

    //To be implemented only by Concrete Prototypes
    public PrototypeIF customizePrototype();

    //Method to finally build the concrete prototype
    public PrototypeIF buildPrototype();

}
