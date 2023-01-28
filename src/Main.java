import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porche", "Cayenne", "Black", 2020.5);
        Car car2 = new Car("Porche", "Cayenne", "Black", 2020.5);
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);

        Human human = new Human(1988, "Marek", "Marucha");
        Animal animal = new Animal("canis", "Rafał");
        Phone phone = new Phone("Samsung", "A3", 2020, true);
        System.out.println(human);
        System.out.println(animal);
        System.out.println(phone);
    }
}