package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, String color, Double mileage) {
        super(producer, model, color, mileage);
    }
    public void refuel(){
        System.out.println("Zatankowałeś troche ropy do swojego dieselka");
    }
}
