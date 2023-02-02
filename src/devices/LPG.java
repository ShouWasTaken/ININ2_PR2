package devices;

public class LPG extends Car{
    public LPG(String producer, String model, String color, Double mileage) {
        super(producer, model, color, mileage);
    }
    public void refuel(){
        System.out.println("Nabite aż pod korek wstydu");
    }
}
