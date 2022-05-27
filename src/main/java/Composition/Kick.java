package Composition;

public class Kick {
    private String model;
    private String size;

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

    public Kick(String model, String size) {
        this.model = model;
        this.size = size;


    }
}
