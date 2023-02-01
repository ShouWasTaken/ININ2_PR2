package devices;
import creatures.Human;
import main.sellable;
public class Car extends Device implements sellable {
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
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
    public void sell(Human buyer, Human seller, Double price){
        if(this.equals(seller.getCar()) && buyer.getCash() >= price){
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setCar(this);
            seller.setCar(null);
            System.out.println("Zakupiono autko");
        }
        else{
            System.out.println("Nie zakupiono autka :(");
        }
    }



}
