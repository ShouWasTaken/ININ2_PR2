package devices;
import creatures.Human;
import main.sellable;
public abstract class Car extends Device implements sellable {
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
    private Double price = 0.0;
    public Double getValue() {
        return price;
    }

    public void setValue(Double price) {
        this.price = price;
    }
    public String toString() {
        return this.producer + " " + this.model + " " + this.color + " " + this.mileage + " " ;
    }

    public void turnOn(){
        System.out.println("Przekręcasz kluczyk");
        System.out.println("Auto kręci, coś nie odpala");
        System.out.println("Uff, jednak odpaliło");
    }
    public void sell(Human buyer, Human seller, Double price) throws Exception{
        if (!seller.hasACar(this)) throw new Exception("Sprzedajacy nie ma auta");
        if (!buyer.hasSpace()) throw new Exception("Brak miejsca w garazu");
        if (buyer.getCash() < price) throw new Exception("Brak pieniedzy");
        buyer.addCar(this);
        seller.removeCar(this);
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        System.out.println("Zakupiono auto");

        }
   public abstract void refuel();



}
