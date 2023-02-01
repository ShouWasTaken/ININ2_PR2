package devices;

public class Car extends Device {
    final String producer;

    final String model;
    String color;
    Double mileage;
    Boolean ison;
    public Car(String producer, String model, String color, Double mileage) {
        this.producer = producer;
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
        return this.producer + " " + this.model + " " + this.color + " " + this.mileage + " " + this.price;
    }

    public void turnOn(){
        System.out.println("Przekręcasz kluczyk");
        System.out.println("Auto kręci, coś nie odpala");
        System.out.println("Uff, jednak odpaliło");
    }



}
