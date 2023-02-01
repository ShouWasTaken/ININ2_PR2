package devices;

public class Phone extends Device {
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
    public void turnOn()
    {
        System.out.println("Przytrzymujesz guzik");
        System.out.println("Telefon się odpala");

    }
}
