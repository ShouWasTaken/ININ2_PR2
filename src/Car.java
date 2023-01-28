public class Car {
    final String brand;

    final String model;
    String color;
    Double mileage;
    Boolean ison;
    private Double price =0.0;
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
