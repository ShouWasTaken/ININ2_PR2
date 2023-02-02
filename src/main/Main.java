package main;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human(2001, "Rafał", "Mazur", 6);
        Car car1 = new Diesel("Porshe", "Panamera", "Black", 100.0);
        Car car2 = new Diesel("Porshe", "Panamera", "Black", 100.0);
        car1.setValue(8000.0);
        car2.setValue(17000.0);
        me.setCar(car1, 0);
        me.setCar(car2, 1);
        System.out.println(me.getCarsValue());

       /* Car car = new Electric("Audi", "E-tron", "Black", 0.0);
        Human seller = new Human(1999, "Marek", "Marucha", 5);
        Human buyer = new Human(1999, "Robert", "Pędziwiatr", 3);
        seller.setCar(car, 2);
        buyer.setCash(1000.0);
        car.sell(buyer, seller, 3000.0);
*/
    }
}