package Composition;

public class Snare {
    private String model;
    private String size;
    private String material;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Snare(String model, String size, String material) {
        this.model = model;
        this.size = size;
        this.material = material;


    }
}
