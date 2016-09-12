package eu.jaimefreire.patterns.creational.prototype.interfaces;

import eu.jaimefreire.patterns.creational.prototype.products.markerInterfaces.Buildable;

/**
 * Created by jaimefreire on 12.09.16.
 */
public interface PrototypeIF extends Buildable {


    public String getPrototypeInfo();
}