package devices;

public class Phone {
    private String producer;
    private String model;
    private int yearOfProduction;
    private boolean isAndroid;
    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = isAndroid;
    }
    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }
}
