package model;

public class Car implements ShowDetail {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String showDetail(){
        return "Brand: " + brand + "\nModel: " + model + "\nColor: " + color;
    }
}