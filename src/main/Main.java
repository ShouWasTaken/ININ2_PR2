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
        seller.setCar(car, 2);
        buyer.setCash(1000.0);
        car.sell(buyer, seller, 3000.0);

    }
}