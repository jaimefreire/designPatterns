package eu.jaimefreire.patterns.creational.factoryMethod.concrete;

import eu.jaimefreire.patterns.creational.factoryMethod.interfaces.ProductIf;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class ConcreteProduct implements ProductIf {

    @Override
    public String actionHeader() {
        return "Action Header";
    }

    @Override
    public String actionBody() {
        return "Action Body";
    }

    @Override
    public String actionFooter() {
        return "Action Footer";
    }
}
