package eu.jaimefreire.patterns.creational.builder.products;

import eu.jaimefreire.patterns.creational.builder.interfaces.ProductIf;

/**
 * Created by jaimefreire on 12.09.16.
 */
public class Product implements ProductIf {

    //Instance properties
    String name = null;
    String type = null;
    int size = 0;

    @Override
    public int getPrice() {
        return price;
    }

    int price=0;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println(this.getClass().getName());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

}