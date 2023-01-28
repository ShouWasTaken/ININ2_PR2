package devices;

public class Car {
    final String brand;

    final String model;
    String color;
    Double mileage;
    Boolean ison;
    public Car(String brand, String model, String color, Double mileage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
    }
    private Double price =0.0;
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString() {
        return this.brand + " " + this.model + " " + this.color + " " + this.mileage + " " + this.price;
    }



}
