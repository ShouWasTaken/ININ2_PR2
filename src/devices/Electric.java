package devices;

public class Electric extends Car{
    public Electric(String producer, String model, String color, Double mileage) {
        super(producer, model, color, mileage);
    }
    public void refuel(){
        System.out.println("Bateryjki naładowane");
    }
}
