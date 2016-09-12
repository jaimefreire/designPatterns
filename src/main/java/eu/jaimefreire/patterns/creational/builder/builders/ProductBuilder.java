package eu.jaimefreire.patterns.creational.builder.builders;

import eu.jaimefreire.patterns.creational.builder.interfaces.Builder;
import eu.jaimefreire.patterns.creational.builder.interfaces.ProductIf;
import eu.jaimefreire.patterns.creational.builder.products.Product;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class ProductBuilder implements Builder {

    Builder builder =null;
    Product product = null;

    //Private constructor to prevent instantiation
    private ProductBuilder(){};

    //One new builder instance each time.
    public Builder createBuilder(final String name, final String type, final int size){
            return new ProductBuilder(name, type, size);
    }


    //Mandatory attributes
    public ProductBuilder(final String name, final String type, final int size)
    {
        Product product = new Product();
        product.setName(name);
        product.setSize(size);
        product.setType(type);
        this.product=product;
    }

    //Not mandatory fields
    @Override
    public ProductIf setPrice(int price)
    {
        this.product.setPrice(price);
        return this.product;
    }

    @Override
    public Product build() {

        //Program to interfaces
        return product;
    }
}
