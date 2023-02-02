package devices;

import main.sellable;
import creatures.Human;

import java.util.List;

public class Phone extends Device implements sellable {
    private boolean isAndroid;
    private static final String DEFAULT_SERVER_ADDRES = "www.mietekpiroman.com";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final String DEFAULT_VERSION = "latest";
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
        if(this.equals(seller.getPhone()) && buyer.getCash() >= price){ // Tu malutka korekta co do zadania 8, zapomniałem zmienić z getCar po copy paste
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
    public void installAnApp(String appName){
        this.installAnApp(appName, DEFAULT_VERSION);
    }
    public void installAnApp(String appName, String version){
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRES);
    }
    public void installAnApp(String appName, String version, String serverAddress){
        this.installAnApp("Instaluje appke: " + appName + " w wersji: " +  version + " z serwera: " + serverAddress);
    }
    public void installAnApp(List<String> appNames){
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }
}
