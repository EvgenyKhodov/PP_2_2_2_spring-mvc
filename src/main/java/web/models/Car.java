package web.models;

public class Car {
    private String model;
    private String color;
    private String racer;

    public Car(String model, String color, String racer) {
        this.model = model;
        this.color = color;
        this.racer = racer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRacer() {
        return racer;
    }

    public void setEngine(String racer) {
        this.racer = racer;
    }
}