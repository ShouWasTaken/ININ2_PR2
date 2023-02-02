package creatures;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Human {
    String firstname;
    String lastname;
    final Integer yearOfBirth;
    private Animal pet;
    private Phone phone;
    private Car[] garage;
    private static final int DEFAULT_GARAGE_SIZE = 5;
    private Double salary = 0.0;
    Date dateOfChange = new Date();
    private Double previousSalary = 0.0;
    private Double cash = 0.0;

    public Double getsalary() {
        System.out.println("Ostatnie pobieranie infromacji o twojej wyplacie: " + dateOfChange + " a twoja wyplata wynosila " + salary); // Mała korekta co do taska 4, który był wcześniej zrobiony eksperymentalnie na labach
        return salary;
    }

   public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Pensja na minus. To tak się da?");
        } else{
        System.out.println("Wysłane do systemu");
        System.out.println("Trzeba odebrać aneks od pani Hani z kadr");
        System.out.println("Panowie z ZUS i US juz jadą, nie ma sensu nic ukrywać");
        this.salary = salary;
        System.out.println("Nowa pensja wynosi: " + salary);
    }
}

    public Human(Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
        garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(Integer yearOfBirth, String firstname, String lastname, Integer garageSize) {
        this.yearOfBirth = yearOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
        garage = new Car[garageSize];
    }

    public Car getCar(int parkingPlace) {
        if (parkingPlace < 0 || parkingPlace >= garage.length) {
            System.out.println("Źle podane miescje");
        }
            return garage[parkingPlace];
        }
    public Animal getPet(){
        return pet;
    }
    public Double getCash() {
        return cash;
    }
    public Phone getPhone(){
        return phone;
    }
    public void setPhone(Phone phone){
        this.phone = phone;
    }


    public void setCash(Double cash) {
        this.cash = cash;
    }
    public void setPet(Animal pet){
        this.pet = pet;
    }

    public void setCar(Car car, int parkingPlace) {
        if (parkingPlace >= this.garage.length) {
            System.out.println("Nie mamy takiego miejsca");
        } else if (parkingPlace < 0) {
            System.out.println("Brak garazu");
        } else if (this.garage[parkingPlace] != null) {
            System.out.println("Miejsce zajete");
        } else {
            this.garage[parkingPlace] = car;
        }
    }

    public String toString() {
        return this.firstname + " " + this.lastname + " " + this.yearOfBirth + " ";
    }
    public void sell(Human buyer, Human seller, Double price) {
        System.out.println("Handel ludzmi jest zakazany");
    }

    public Double getCarsValue(){
        Double total = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                total += this.garage[i].getValue();
            }
        }
        return total;
    }
    public boolean hasACar(Car car) {
        for (Car a: garage) {
            if (a == car) return true;
        }
        return false;
    }

    public boolean hasSpace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) return true;
        }
        return false;
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                return;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                return;
            }
        }
    }
}
