package Composition;

public class Cymbals {
    private String brand;
    private String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cymbals(String brand, String size) {
        this.brand = brand;
        this.size = size;


    }
}

