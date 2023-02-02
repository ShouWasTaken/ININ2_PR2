package main;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone("Samsung", "S70", 2022, true);
     Application app = new Application("Jutube premium", "Latest", 5.0);
        Application app2 = new Application("Szpotifaj premium", "Latest", 10.0);
        Application app3 = new Application("Messenger", "Latest", 0.0);
        Application app4 = new Application("Adobe Light", "Latest", 55.0);
     Human human = new Human(2001, "Marek", "Marecki", 3);
     human.setCash(3000.0);
     phone.installApp(human, app);
        phone.installApp(human, app2);
        phone.installApp(human, app3);
        phone.installApp(human, app4);
     System.out.println(human.getCash());
     System.out.println(phone.isInstalled("Jutube premium"));
     System.out.println(phone.FreeApps());
     System.out.println(phone.valueOfInstalled());
    }
}