public class Main {
    public static void main(String[] args) {
        Human human = new Human(1988, "Andrzej", "Lebiedo");


        Car auto = new Car("Audi", "RS3");
        auto.color = "Black";
        auto.mileage = 264000.4;
        auto.ison = true;

        human.car = auto;








    }
}