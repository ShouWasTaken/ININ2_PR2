package devices;
import creatures.Human;
import main.sellable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements sellable {
    final String producer;

    final String model;
    String color;
    Double mileage;
    Boolean ison;
    public List<Human> ownersList = new ArrayList<>();
    public Human owner;

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
        if (getOwner() != seller) throw new Exception("Sprzedawca chce sprzedać nie swoje auto");

        ownersList.add(buyer);
        buyer.addCar(this);
        seller.removeCar(this);
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        System.out.println("Zakupiono auto");

        }
   public abstract void refuel();
    public Human getOwner(){
        return ownersList.get(ownersList.size() - 1);
    }
    public void setOwner(Human human){
        this.ownersList.add(human);
    }
    public int getOwnersList(){
        return ownersList.size() - 1;
    }
    public boolean wasOwner(Human human){
        return ownersList.contains(human);
    }
    public boolean wasSoldBetween(Human seller, Human buyer) {
        int index1 = ownersList.indexOf(seller);
        int index2 = ownersList.indexOf(buyer);
        return index1 != -1 && index2 != -1 && index1 < index2;
    }



}
