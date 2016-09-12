package eu.jaimefreire.patterns.creational.abstractFactory;

import eu.jaimefreire.patterns.creational.abstractFactory.factories.ConcreteFactoryA;
import eu.jaimefreire.patterns.creational.abstractFactory.factories.ConcreteFactoryB;
import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractFactoryIF;
import eu.jaimefreire.patterns.creational.abstractFactory.interfaces.AbstractProduct;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by jaimefreire on 11.09.16.
 */
public class MainAbstractFactory {

    //Starting point for app.
    public static void main(String[] args) {

        AbstractFactoryIF factoryA;
        AbstractFactoryIF factoryB;


        factoryA = new ConcreteFactoryA();
        factoryB = new ConcreteFactoryB();

        AbstractProduct productA = factoryA.createProduct("Product A");
        AbstractProduct productB = factoryB.createProduct("Product B");

        productA.action();
        productA.toString();

        productB.action();
        productB.toString();

        assertEquals("ProductA does not belong to the " +
                "correect class", productA.toString(),productA.getClass().getName());
        assertEquals("ProductB does not belong to the correct " +
                "class",productB.toString(),productB.getClass().getName());


    }

    /**
     * This is just for the sake of testing this program, and doesn't have to do
     * with Abstract Factory pattern.
     * @return
     */
    public static String randomAppearance() {
        String[] appearanceArr = new String[2];
        appearanceArr[0] = "A";
        appearanceArr[1] = "B";
        java.util.Random rand = new java.util.Random();
        int randNum = rand.nextInt(2);
        return appearanceArr[randNum];
    }
}
