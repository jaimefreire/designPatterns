package eu.jaimefreire.patterns.creational.builder;

import eu.jaimefreire.patterns.creational.builder.builders.ProductBuilder;
import eu.jaimefreire.patterns.creational.builder.interfaces.Builder;
import eu.jaimefreire.patterns.creational.builder.interfaces.ProductIf;
import eu.jaimefreire.patterns.creational.builder.products.Product;
import org.junit.Assert;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class MainBuilder {

    public static void main(String[] args) {

        Builder builder = new ProductBuilder("Name", "Type", 99);
        Builder builderOptional = new ProductBuilder("Name", "Type", 99);
        builderOptional.setPrice(45);

        ProductIf product = builder.build();
        ProductIf productB = builderOptional.build();

        product.action();
        productB.action();

        Assert.assertEquals("The product object class is not correct", true ,product instanceof Product);

        Assert.assertEquals("ProductB Price is not correct", productB.getPrice(),45);

    }

}
