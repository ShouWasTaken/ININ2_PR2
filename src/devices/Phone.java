package devices;

import main.sellable;
import creatures.Human;

public class Phone extends Device implements sellable {
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
    public void sell(Human buyer, Human seller, Double price){
        if(this.equals(seller.getCar()) && buyer.getCash() >= price){
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setPhone(this);
            seller.setPhone(null);
            System.out.println("Zakupiono telefon");
        }
        else{
            System.out.println("Otoz nie tym razem");
        }
    }
}
