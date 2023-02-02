package devices;

public abstract class Device {
    String producer;
    String model;
    int yearOfProduction;
    public Double value;

    public abstract void turnOn();
    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }
}
