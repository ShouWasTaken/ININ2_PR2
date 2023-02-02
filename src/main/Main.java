package main;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
       /*
        Car car2 = new Car("Porche", "Cayenne", "Black", 2020.5);
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);

        creatures.Human human = new creatures.Human(1988, "Marek", "Marucha");
        creatures.Animal animal = new creatures.Animal("canis", "Rafał");
        Phone phone = new Phone("Samsung", "A3", 2020, true);
        System.out.println(human);
        System.out.println(animal);
        System.out.println(phone); */
        Car car = new Car("Porche", "Cayenne", "Black", 2020.5);
        Phone phone = new Phone("Apple", "IPhone 11 Pro", 2018, false);
        Animal pet = new Pet("fenis");

        Human seller = new Human(2000, "Marek", "Marucha");
        Human buyer = new Human(2000, "Robert", "Pędziwiatr");
        seller.setCar(car);
        buyer.setCash(8000.0);
        car.sell(buyer, seller, 1000.0);
        System.out.println(seller.getCash() + " " + buyer.getCash());
        System.out.println(seller.getCar() + " " + buyer.getCar());
    }
}