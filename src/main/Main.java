package main;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.*;

public class Main {
    public static void main(String[] args) throws Exception {

       Car car = new Electric("Audi", "E-tron", "Black", 0.0);
        Human seller = new Human(1999, "Marek", "Marucha", 5);
        Human buyer = new Human(1999, "Robert", "Pędziwiatr", 3);
        car.setOwner(seller);
        seller.setCar(car, 0);

        car.wasOwner(seller);
        buyer.setCash(8000.0);
        car.sell(buyer, seller, 3000.0);
        car.getOwnersList();
    }
}