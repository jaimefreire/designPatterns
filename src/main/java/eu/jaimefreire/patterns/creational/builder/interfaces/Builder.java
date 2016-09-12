package eu.jaimefreire.patterns.creational.builder.interfaces;

/**
 * Created by jaimefreire on 12.09.16.
 */
public interface Builder {

    //Not mandatory fields
    ProductIf setPrice(int price);

    ProductIf build();
}
