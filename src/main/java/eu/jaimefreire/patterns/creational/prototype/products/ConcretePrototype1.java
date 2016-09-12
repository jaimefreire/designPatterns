package eu.jaimefreire.patterns.creational.prototype.products;

import eu.jaimefreire.patterns.creational.prototype.interfaces.PrototypeIF;
import eu.jaimefreire.patterns.creational.prototype.products.abstractProduct.Prototype;
import eu.jaimefreire.patterns.creational.prototype.products.markerInterfaces.Buildable;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class ConcretePrototype1 implements PrototypeIF {


    String customProperty1;
    String customProperty2;
    String customProperty3;
    //
    Prototype prototype = null ;

    //Overriding default constructor
    public ConcretePrototype1()
    {
        //Composition, inherit functionality without tight coupling.
        prototype = new Prototype() {
            @Override
            public PrototypeIF customizePrototype() {
                return this.customizePrototype();
            }

            @Override
            public PrototypeIF buildPrototype() {
                return this.buildPrototype();
            }
        };
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "customProperty1='" + customProperty1 + '\'' +
                ", customProperty2='" + customProperty2 + '\'' +
                ", customProperty3='" + customProperty3 + '\'' +
                ", prototype=" + prototype +
                '}';
    }

    //There's no concrete implementation in this class so we write the following to make sure we use the functionality
    @Override
    public PrototypeIF preparePrototype() {
        return ((PrototypeIF)prototype).preparePrototype();
    }

    //Use own implementation
    @Override
    public String getPrototypeInfo() {
        return this.toString();
    }

        /**
         * Customize the prototype
         *
         * @return
         */
    public PrototypeIF customizePrototype() {
        this.setCustomProperty1("Custom-1");
        this.setCustomProperty2("Custom-2");
        this.setCustomProperty3("Custom-3");

        return this;
    }

    public String getCustomProperty1() {
        return customProperty1;
    }

    public void setCustomProperty1(String customProperty1) {
        this.customProperty1 = customProperty1;
    }

    public String getCustomProperty2() {
        return customProperty2;
    }

    public void setCustomProperty2(String customProperty2) {
        this.customProperty2 = customProperty2;
    }

    public String getCustomProperty3() {
        return customProperty3;
    }

    public void setCustomProperty3(String customProperty3) {
        this.customProperty3 = customProperty3;
    }

    @Override
    public PrototypeIF buildPrototype() {
        preparePrototype();
        customizePrototype();
        return this;
    }

}
