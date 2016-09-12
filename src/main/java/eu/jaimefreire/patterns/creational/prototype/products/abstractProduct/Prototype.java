package eu.jaimefreire.patterns.creational.prototype.products.abstractProduct;

import eu.jaimefreire.patterns.creational.prototype.interfaces.PrototypeIF;

import java.util.UUID;

/**
 * Created by jaimefreire on 12.09.16.
 */
public abstract class Prototype implements PrototypeIF{


    //Local variables generic to all prototypes
    private String name;
    private String type;
    private int size;
    private String description;


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }


    @Override
    public PrototypeIF preparePrototype(){
        this.setName("Prototype " + UUID.randomUUID());
        this.setSize(55); //Standard size
        this.setType("Std. Type");
        this.setDescription("Generic prototype template; please change");
        return (PrototypeIF) this; //Return Object interface

    }

    @Override
    public String getPrototypeInfo() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", description='" + description + '\'' +
                "'} - " + this.getClass().getName();
    }
}
