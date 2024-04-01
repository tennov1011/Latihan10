package model;

public class Pedicab {
    private String brand;
    private String model;
    private String color;

    public Pedicab(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String showDetail(){
        return "Brand: " + brand + "\nModel: " + model + "\nColor: " + color;
    }
}
